package com.zy.designPattern.proxy.aop;

import com.zy.designPattern.common.Stu;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service("logAspectService")
public class LogAspectServiceImpl {

    @LogAspect
    public Object hello(Stu stu) {
        return stu.toString() + "---> end";
    }

}
