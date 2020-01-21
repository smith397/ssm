package cn.it.test;

import cn.it.dao.UserDao;
import cn.it.domain.user;
import javafx.application.Application;
import javafx.stage.Stage;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class itemtest {
    @Test//只能放在方法上
    public void findbyid()
    {
        List<user> us = null;
        //获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中拿到所需的dao层对象
        UserDao userdao = ac.getBean(UserDao.class);
        //调用方法
        us = userdao.findAll();
        //打印
        for (user zj :us)
        {
            System.out.println(zj);
        }

    }
    @Test
    public void save()
    {
        user us = new user();
        us.setUser_name("yyq");
        us.setPassword("didi");
        //获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中拿到所需的dao层对象
        UserDao userdao = ac.getBean(UserDao.class);
        //调用方法
        userdao.save(us);
        //打印
//        for (user zj :us)
//        {
//            System.out.println(zj);
//        }

    }

}
