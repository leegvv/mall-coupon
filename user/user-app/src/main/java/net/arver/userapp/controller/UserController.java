package net.arver.userapp.controller;

import net.arver.userapp.service.UserService;
import net.arver.userserviceapi.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 通过用户id查询用户信息.
     * @param id id
     * @return 用户信息
     */
    @RequestMapping("getUserById")
    public UserVo getUserById(Integer id) {
        if (id == null || id == 0) {
            return new UserVo();
        }
        return userService.getUserById(id);
    }
}
