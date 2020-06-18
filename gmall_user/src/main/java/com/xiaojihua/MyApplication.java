package com.xiaojihua;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class MyApplication
{
    /**
     * 启动spring应用，测试服务提供者
     * @param args
     */
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("provider.xml");
        System.in.read();
    }
}
