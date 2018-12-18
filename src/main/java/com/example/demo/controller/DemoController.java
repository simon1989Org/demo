package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DemoController {


    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> demo(){
        Map<String, String> map = new HashMap<>();
        map.put("appName", "demo");

        return map;
    }
}
