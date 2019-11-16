package com.zy.designPattern.proxy.aop;

import com.zy.designPattern.common.Stu;
import org.springframework.stereotype.Service;

@Service("logAspectService")
@LogAspect
public class LogAspectServiceImpl {

    public Object hello(Stu stu) {
        return stu.toString() + "---> end";
    }

}
