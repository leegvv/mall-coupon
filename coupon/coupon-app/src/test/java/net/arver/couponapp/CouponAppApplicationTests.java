package net.arver.couponapp;

import net.arver.couponapp.entity.Coupon;
import net.arver.couponapp.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CouponAppApplicationTests {

    @Autowired
    private CouponService couponService;

    @Test
    void contextLoads() {
    }

    @Test
    public void testQuery() {
        final List<Coupon> couponList = couponService.getCouponList();
        System.out.println(couponList);
    }

}
