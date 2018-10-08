package com.wangjn.stag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Start
 *
 * @author wangjn
 * @date 2018/9/28
 */
@SpringBootApplication
public class Start {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Start.class, args);
    }
}
