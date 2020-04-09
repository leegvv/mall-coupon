package net.arver.couponapp.controller;

import net.arver.couponapp.service.CouponService;
import net.arver.userserviceapi.vo.UserVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private CouponService couponService;

    @RequestMapping("getUserById")
    public UserVo getUserById(){
        return couponService.getUserById(1);
    }


}
