package com.brayden.myview.jvm;

/**
 * JVM测试
 * @Description：
 * @Date: Created in 2020/8/16 21:49
 * @Author Brayden
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        int add = helloWorld.add();
        System.out.println(add);
    }
}
