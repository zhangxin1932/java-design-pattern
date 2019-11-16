package com.zy.designPattern;

import com.zy.designPattern.common.Stu;
import com.zy.designPattern.proxy.aop.LogAspectServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:META-INF/applicationContext.xml")
public class LogAspectServiceImplTest {

    @Autowired
    private LogAspectServiceImpl logAspectService;

    @Test
    public void testHello() {
        Object hello = logAspectService.hello(new Stu(1, "tom"));
        System.out.println(" --------- " + hello);
    }
}
