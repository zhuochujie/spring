package com.xiaoz.test;

import com.xiaoz.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson02 {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");

        //从容器获取两次bean
        IUserService userService1 = (IUserService) context.getBean("userService");
        IUserService userService2 = (IUserService) context.getBean("userService");

        System.out.println(userService1);
        System.out.println(userService2);
    }
}
