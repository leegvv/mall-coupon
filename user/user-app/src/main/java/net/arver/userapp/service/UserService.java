package net.arver.userapp.service;

import net.arver.userapp.entity.User;
import net.arver.userapp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(final int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
