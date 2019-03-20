package com.xiaoz.test;

import com.xiaoz.model.User;
import com.xiaoz.service.IUserService;
import com.xiaoz.web.action.UserAction;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson08 {

    @Test
    public void test() throws Exception {
        //注解的使用
        //web开发流程action -> service -> dao
        //拿到service
        ApplicationContext context = new ClassPathXmlApplicationContext("beans08.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        //添加用户
        User user = new User();
        user.setUsername("xaioZ");
        user.setPassword("123456");
        userService.add(user);
    }
    @Test
    public void test2() throws Exception {
        //注解的使用
        //web开发流程action -> service -> dao
        //拿到action
        ApplicationContext context = new ClassPathXmlApplicationContext("beans08.xml");
        UserAction Useraction = (UserAction) context.getBean("userAction");
        //添加用户
        User user = new User();
        user.setUsername("xaioZ");
        user.setPassword("123456");
        Useraction.save(user);
    }
}
