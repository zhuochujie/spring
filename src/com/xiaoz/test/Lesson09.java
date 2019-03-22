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
        UserAction useraction = context.getBean(UserAction.class);

        User user = new User();
        user.setUsername("xaioZ");
        user.setPassword("123456");
        useraction.save(user);

        UserAction useraction2 = context.getBean(UserAction.class);
        System.out.println(useraction);
        System.out.println(useraction2);

        context.getClass().getMethod("close").invoke(context);
    }
}
