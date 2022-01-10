package com.dev.qc.demo.controller;



import lombok.extern.slf4j.Slf4j;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



/**
 * 设备异常统计controller
 *
 * @author ljh
 * @date 2021/7/15
 */
@RestController
@Slf4j
public class IndexController  {


    /**
     * @param dto sadfsa阿的说法是
     */
    @RequestMapping(value = "/spc", method = RequestMethod.GET)
    public void expressionverification(String dto) {
        log.info("paramter,{}",dto);
    }



}
