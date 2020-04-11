package net.arver.couponapp;

import net.arver.couponapp.service.CouponService;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * JMH基准测试.
 */

@State(Scope.Thread)
public class JMHTest {

    private ConfigurableApplicationContext context;

    private CouponService couponService;

    @Setup
    public void init() {
        context = SpringApplication.run(CouponAppApplication.class);
        couponService = context.getBean(CouponService.class);
    }

    @TearDown
    public void destroy() {
        context.close();
    }

    public static void main(String[] args) throws RunnerException {
        final Options options = new OptionsBuilder().include(JMHTest.class.getSimpleName())
            .warmupIterations(2).measurementIterations(2).forks(1).build();
        new Runner(options).run();
    }

    @Benchmark
    public void testGetCouponList() {
        couponService.getCouponList();
    }

}
