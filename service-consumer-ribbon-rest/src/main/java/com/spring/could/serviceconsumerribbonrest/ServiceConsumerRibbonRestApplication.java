package com.spring.could.serviceconsumerribbonrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication       //标注spring boo服务启动入口t
@EnableDiscoveryClient     //spring could 向服务器注册
@EnableHystrix           //注解开启Hystrix
@EnableHystrixDashboard    //开启hystrixDashboard：
public class ServiceConsumerRibbonRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumerRibbonRestApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
