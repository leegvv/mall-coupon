package net.arver.couponapp.service;

import net.arver.couponapp.constant.Constant;
import net.arver.couponapp.entity.Coupon;
import net.arver.couponapp.entity.CouponExample;
import net.arver.couponapp.mapper.CouponMapper;
import net.arver.userserviceapi.service.IUserService;
import net.arver.userserviceapi.vo.UserVo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class CouponService {

    @Resource
    private CouponMapper couponMapper;

    @Reference(version = "${app.service.version}", url = "${app.service.url}", timeout = 10000)
    private IUserService userService;

    public UserVo getUserById(final int id) {
        return userService.getUserById(id);
    }

    /**
     * 获取优惠券列表.
     * @return 优惠券列表
     */
    public List<Coupon> getCouponList() {
        final CouponExample example = new CouponExample();
        example.createCriteria().andStatusEqualTo(Constant.VALID)
            .andStartTimeLessThan(new Date()).andEndTimeGreaterThan(new Date());
        return  couponMapper.selectByExample(example);
    }
}
