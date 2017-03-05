package com.frank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by frankborg on 04/03/2017.
 */
@RestController
public class HelloWorldController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "HelloWorld";
    }
}
