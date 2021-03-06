package com.spring.could.hystric;

import com.spring.could.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

//SchedualServiceHiHystric需要实现SchedualServiceHi 接口，并注入到Ioc容器中
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {        //
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}