package cn.it.service;

import cn.it.domain.user;

import java.util.List;

public interface UserServiceInterface {
    public List<user> findAll();
    public void save(user User);
}
