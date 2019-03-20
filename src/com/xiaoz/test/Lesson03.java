package com.xiaoz.test;

import com.xiaoz.model.User;
import com.xiaoz.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson03 {

    @Test
    public void test() throws Exception {
        //bean的生命周期
        ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");

        User user = (User) context.getBean("user");

        System.out.println(user);

        //关闭容器
        context.getClass().getMethod("close").invoke(context);
    }
}
