package com.yinhai;

/**
 * @description:
 * @author: Mr.Li
 * @create: 2019-04-01 20:44
 **/
public class lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
        //表达式结构
        new Thread(()-> System.out.println("hee"));

        //语句块
        new Thread(() -> {
            System.out.println("ok");
            System.out.println("god");
        });
    }
    //lambda只能用在函数式接口上
    //1、只有一个抽象方法就是函数式接口
    //2、Object类中的方法无效
    public void test()

    {
        new Thread(() -> System.out.println());
       // sayHello(Integer::parseInt);
    }
    //方法引用


    private interface MyInterface{
        int sayHello(Integer age);
        String toString();
    }

    public static void sayHello(MyInterface myInterface){
        myInterface.sayHello(12);
    }
}
//stream不存储结果
//不改变源头
//
