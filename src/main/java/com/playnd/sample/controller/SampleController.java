package com.playnd.sample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bae B K on 2018. 6. 27.
 */
@RestController
@Slf4j
public class SampleController {
    
    @RequestMapping(value = "/")
    public String home(){
        log.info("home controller!!!!!");
        
        return "spring legacy sample with java config!!!";
    }
}
