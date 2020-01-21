package cn.it.dao;

import cn.it.domain.user;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

//这里的javabean对象属性必须要和字段名一致才行
    @Select("select * from ssm")
    public List<user> findAll();

    @Insert("insert into ssm(user_name,password) values (#{user_name},#{password})")
    public void save(user User);

}
