package com.xiaoz.dao;

        import com.xiaoz.model.User;
        import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao{
    @Override
    public void add(User user){
        System.out.println("dao 添加用户：" + user);
    }
}
