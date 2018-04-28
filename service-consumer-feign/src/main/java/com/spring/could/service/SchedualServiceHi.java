package com.spring.could.service;

import com.spring.could.hystric.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVICE-HI",fallback = SchedualServiceHiHystric.class)    //在FeignClient的SchedualServiceHi接口的注解中加上fallback的指定类
public interface SchedualServiceHi {
        @RequestMapping(value = "/hi",method = RequestMethod.GET)
        public String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
