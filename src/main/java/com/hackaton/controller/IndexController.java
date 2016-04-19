package com.hackaton.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by etovladislav on 19.04.16.
 */
@Controller
public class IndexController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getIndexPage() {
        return "hello";
    }
}
