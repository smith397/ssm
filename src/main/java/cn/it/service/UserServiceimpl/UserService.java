package cn.it.service;

import cn.it.dao.UserDao;
import cn.it.domain.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ClientInfoStatus;
import java.util.List;
@Service
public class UserService implements UserServiceInterface{

    @Autowired
    UserDao dao;
    public List<user> findAll()
    {
       return dao.findAll();
    }
    public void save(user User) {
        dao.save(User);
    }
}
