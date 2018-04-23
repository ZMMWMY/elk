package com.sxc.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Description:
 *
 * @author: ZMM
 * @version: 1.0
 * Filename:    	ActivityApplication
 * Create at:   	2018/4/20
 * <p>
 * Copyright:   	Copyright (c)2018
 * Company:     	songxiaocai
 * <p>
 * Modification History:
 * Date        		      Author          Version      Description
 * ------------------------------------------------------------------
 * 2018/4/20    	          ZMM           1.0          1.0 Version
 */
@SpringBootApplication
@EnableScheduling
public class ActivityApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ActivityApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ActivityApplication.class, args);
    }

    @Scheduled(cron = "*/40 * * * * ?")
    public void error(){
        LOGGER.error("测试error",new RuntimeException());
    }

    @Scheduled(cron = "*/10 * * * * ?")
    public void info(){
        LOGGER.info("测试info");
    }

    @Scheduled(cron = "*/5 * * * * ?")
    public void debug(){
        LOGGER.debug("测试debug");
    }


}
