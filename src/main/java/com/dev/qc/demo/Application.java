package com.dev.qc.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * asdfasdfads
 */
@SpringBootApplication
@ServletComponentScan
@Slf4j
public class Application {


    /**
     * 启动入口<br>
     *
     * @param args 启动时指定的参数
     */
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(Application.class, args);
        log.info("^_^ ######################################################## ^_^");
        log.info("^_^ ###: Application was started,{} seconds.", (System.currentTimeMillis() - start) / 1000);
        log.info("^_^ ######################################################## ^_^");
    }
}