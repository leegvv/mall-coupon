package net.arver.couponapp.service;

import net.arver.userserviceapi.service.IUserService;
import net.arver.userserviceapi.vo.UserVo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class CouponService {

    @Reference(version = "${app.service.version}", url = "${app.service.url}", timeout = 10000)
    private IUserService userService;

    public UserVo getUserById(final int id) {
        return userService.getUserById(id);
    }
}
