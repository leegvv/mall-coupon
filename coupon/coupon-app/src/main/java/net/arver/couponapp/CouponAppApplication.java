package net.arver.couponapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.arver.couponapp.mapper")
public class CouponAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouponAppApplication.class, args);
    }

}
