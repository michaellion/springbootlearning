package com.yinhai.Example;

import com.yinhai.entity.Apple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: Mr.Li
 * @create: 2019-04-01 21:25
 **/
public class FilterExample {

    public static void main(String[] args) {
        Map<Integer, Apple> map = new HashMap<>();
        List<Apple> list = new ArrayList<>();
       // list.add(new Apple(1,"red","200","hongfushi"));
        list.add(new Apple(1,"red","200","hongfushi"));
        list.add(new Apple(2,"red","230","hongfushi"));
        list.add(new Apple(3,"green","300","hongfushi"));
        list.add(new Apple(4,"green","350","hongfushi"));

        list.stream().filter(a -> a.getColour() == "red").forEach(System.out::println);

     //  list.stream().forEach(apple -> System.out.println(apple.getColour()));

    }
}
