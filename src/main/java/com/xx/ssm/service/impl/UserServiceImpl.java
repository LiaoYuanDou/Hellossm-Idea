package com.xx.ssm.service.impl;


import com.xx.ssm.dao.IUserDao;
import com.xx.ssm.model.User;
import com.xx.ssm.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }
}
