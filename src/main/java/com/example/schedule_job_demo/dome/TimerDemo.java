package com.example.schedule_job_demo.dome;

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 第一种方式：JDK自带的java.util.TimerDemo；通过调度java.util.TimerTask的方式
 * 让程序按照某一个频度执行，但不能在指定时间运行。 一般用的较少，不推荐,用timer不如用ScheduledExecutorService
 */
public class TimerDemo {

    public static void main(String[] args) {

        //定义任务
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {

                System.out.println("执行任务："+ LocalDateTime.now());

            }
        };

        //定义任务器
        Timer timer = new Timer();

        timer.schedule(timerTask,0,3000);

    }
}
