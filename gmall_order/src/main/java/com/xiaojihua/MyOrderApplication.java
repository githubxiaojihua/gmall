package com.xiaojihua;

import com.xiaojihua.gmall.bean.UserAddress;
import com.xiaojihua.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class MyOrderApplication
{
    /**
     * 启动服务消费者
     * @param args
     * @throws IOException
     */
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");

        OrderService orderService = applicationContext.getBean(OrderService.class);

        List<UserAddress> userAddresses = orderService.initOrder("1");
        for(UserAddress a : userAddresses){
            System.out.println(a.getUserAddress());
        }
        //System.out.println(userAddresses);
        System.out.println("调用完成....");
        //System.in.read();
    }
}
