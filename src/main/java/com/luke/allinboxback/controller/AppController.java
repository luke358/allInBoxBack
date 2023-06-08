package com.luke.allinboxback.controller;


import com.luke.allinboxback.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author luke
 * @since 2023-06-07 06:04:25
 */
@RestController
@RequestMapping("/allinboxback/app")
public class AppController {

    @Autowired
    private AppService appService;

    @GetMapping("/list")
    public Map list() {
        Map map = new HashMap();
        map.put("data", appService.list());
        map.put("code", 200);

        return map;
    }
}
