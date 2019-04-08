mybatis XML文档的基本元素
```
<select id="selectPerson" parameterType="int" resultType="hashmap">
  SELECT * FROM PERSON WHERE ID = #{id}
</select>
```

```
<select
  id="selectPerson"              //唯一的命名空间标识
  parameterType="int"            //参数类型
  parameterMap="deprecated"
  resultType="hashmap"            //结果类型
  resultMap="personResultMap"     // 映射的结果集
  flushCache="false"              //不清楚本地缓存和二级缓存
  useCache="true"                 //使用缓存
  timeout="10"                     //超时时间
  fetchSize="256"                   //
  statementType="PREPARED"          //语句类型，默认prepared
  resultSetType="FORWARD_ONLY">     //依赖驱动 
```

* insert update delete语句的申明
```
<insert
  id="insertAuthor"
  parameterType="domain.blog.Author"
  flushCache="true"
  statementType="PREPARED"
  keyProperty=""
  keyColumn=""
  useGeneratedKeys=""
  timeout="20">

<update
  id="updateAuthor"
  parameterType="domain.blog.Author"
  flushCache="true"
  statementType="PREPARED"
  timeout="20">

<delete
  id="deleteAuthor"
  parameterType="domain.blog.Author"
  flushCache="true"
  statementType="PREPARED"
  timeout="20">
```
* insert delete update语句
```
<insert id="insertAuthor">
  insert into Author (id,username,password,email,bio)
  values (#{id},#{username},#{password},#{email},#{bio})
</insert>

<update id="updateAuthor">
  update Author set
    username = #{username},
    password = #{password},
    email = #{email},
    bio = #{bio}
  where id = #{id}
</update>

<delete id="deleteAuthor">
  delete from Author where id = #{id}
</delete>
```

* 批量插入
```
<insert id="insertAuthor" useGeneratedKeys="true"
    keyProperty="id">
  insert into Author (username, password, email, bio) values
  <foreach item="item" collection="list" separator=",">
    (#{item.username}, #{item.password}, #{item.email}, #{item.bio})
  </foreach>
</insert>
```
