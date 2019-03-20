package com.xiaoz.test;

import com.xiaoz.model.User;
import com.xiaoz.service.IUserService;
import com.xiaoz.web.action.UserAction;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson09 {

    @Test
    public void test() throws Exception {
        //注解的使用
        //web开发流程action -> service -> dao
        //拿到service
        ApplicationContext context = new ClassPathXmlApplicationContext("beans09.xml");
        //获取action
        UserAction Useraction = context.getBean(UserAction.class);

        User user = new User();
        user.setUsername("xaioZ");
        user.setPassword("123456");
        Useraction.save(user);
    }
}
