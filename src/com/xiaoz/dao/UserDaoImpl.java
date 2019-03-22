package com.xiaoz.dao;

        import com.xiaoz.model.User;
        import org.springframework.stereotype.Repository;

        import javax.annotation.PostConstruct;
        import javax.annotation.PreDestroy;

@Repository
public class UserDaoImpl implements IUserDao{

    @PostConstruct//相当于init-method="myInit"
    public void myInit(){
        System.out.println("自定义的初始化方法...");
    }

    @PreDestroy//相当于destroy-method="myDestroy"
    public void myDestroy(){
        System.out.println("自定义的销毁方法...");
    }

    @Override
    public void add(User user){
        System.out.println("dao 添加用户：" +  user);
    }
}
