package com.example.schedule_job_demo.dome;


import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.StackLocatorUtil;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 *
 * Spring3.0 以后新增了task，一个轻量级的Quartz，功能够用，用法简单。
 * 只需要依赖spring-boot-starter-web
 *
 */
@Slf4j
@Component
public class SpringTaskDemo {

    @Async
    @Scheduled(cron = "0/3 * * * * *")
    public void task(){

        log.info("执行任务：{}",LocalDateTime.now());
    }
}
