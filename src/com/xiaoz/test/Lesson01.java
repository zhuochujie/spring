package com.xiaoz.test;

import com.xiaoz.service.IUserService;
import com.xiaoz.service.UserServiceFactory1;
import com.xiaoz.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Lesson01 {

    @Test
    public void test(){
        /*1.加载beans.xml这个spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        2.从spring容器中获取userService对象
        IUserService userService = (IUserService) context.getBean("userService1");
        userService.add();*/

        //BeanFactory采取延迟加载,第一次getBean时才会初始化Bean
        //ApplicationContext采取实时加载,是对BeanFactory的拓展,提供更多的功能


        //spring容器加载的3种方式
        /*第一种:ClassPathXmlApplicationContext,类路径加载(常用)
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        第二种:文件系统路径获得配置文件[绝对路径]
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\study\\spring\\src\\beans.xml");
        第三种:使用BeanFactory(了解)
        String path = "D:\\study\\spring\\src\\beans.xml";
        BeanFactory context = new XmlBeanFactory(new FileSystemResource(path));
        IUserService user = (IUserService) context.getBean("userService1");
        user.add();*/
        //静态工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        IUserService userService1 = (IUserService) context.getBean("userService2");
        userService1.add();
    }
}
