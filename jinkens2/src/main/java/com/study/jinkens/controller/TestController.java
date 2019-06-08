package com.study.jinkens.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * fileName:TestController
 * description:
 * author:hcq
 * createTime:2019-06-08 19:03
 */
@RestController
@Slf4j
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        log.debug(">>>>>启动打印日志:debug<<<<<");
        log.info(">>>>>启动打印日志:info<<<<<");
        log.error(">>>>>启动打印日志:error<<<<<");
        return "hello world!"+format.format(new Date());
    }
}
