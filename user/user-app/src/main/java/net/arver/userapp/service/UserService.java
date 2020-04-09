package net.arver.userapp.service;

import net.arver.userapp.entity.User;
import net.arver.userapp.mapper.UserMapper;
import net.arver.userserviceapi.service.IUserService;
import net.arver.userserviceapi.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

@org.apache.dubbo.config.annotation.Service(version = "${app.service.version}")
@org.springframework.stereotype.Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserVo getUserById(final int id) {
        final User user = userMapper.selectByPrimaryKey(id);
        final UserVo userVo = new UserVo();
        BeanUtils.copyProperties(user, userVo);
        return userVo;
    }
}
