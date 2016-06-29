package me.caiyuan.spring.aspect;

import me.caiyuan.spring.aspect.concert.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * YUAN
 * 6/29/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Audience.class, loader = AnnotationConfigContextLoader.class)
public class PerformanceTest {

    @Autowired
    private Performance performance;

    @Test
    public void t() {
        performance.perform();
    }

}
