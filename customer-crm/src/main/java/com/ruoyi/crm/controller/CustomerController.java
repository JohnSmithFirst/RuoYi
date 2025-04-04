package com.ruoyi.crm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class CustomerController {
    public static final Logger log = LoggerFactory.getLogger(CustomerController.class);
    @PostConstruct
    private void init(){
        log.info("CustomerController init");
    }

}
