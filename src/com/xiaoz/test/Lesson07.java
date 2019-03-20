package com.xiaoz.test;

import com.xiaoz.model.Programmer;
import com.xiaoz.model.User;
import com.xiaoz.service.IUserService;
import com.xiaoz.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson07 {

    @Test
    public void test() throws Exception {
        //注解取代xml中bean配置
        /*
        1.Spring默认情况下注释不生效，开启注解功能
        2.如何开启Spring的注解功能
            在xml中配置下面两行代码
        */
        ApplicationContext context  = new ClassPathXmlApplicationContext("beans07.xml");

        //1.如果@Component没配置id，通过类型获取
        //2.这个类型可以是接口，也可以是实现类
        //IUserService service = (IUserService) context.getBean(UserServiceImpl.class);
        //IUserService service = (IUserService) context.getBean(IUserService.class);
        //如果@Component("userService")配置了id，通过id获取
        IUserService service = (IUserService) context.getBean("userService");

        User user = new User();
        user.setUsername("xiaoZ");

        service.add(user);
    }
}
