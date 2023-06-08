package com.luke.allinboxback.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.luke.allinboxback.entity.App;
import com.luke.allinboxback.entity.UserApp;
import com.luke.allinboxback.mapper.AppMapper;
import com.luke.allinboxback.service.AppService;
import com.luke.allinboxback.service.UserAppService;
import com.luke.allinboxback.vo.UserAppVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
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
@RequestMapping("/allinboxback/user-app")
public class UserAppController {

    @Autowired
    private UserAppService userAppService;

    @Autowired
    private AppService appService;

    @PostMapping("/add")
    public Map addUserService(@RequestBody UserApp userApp) {
        Map map = new HashMap();
        userApp.setUserId(1);
        App app = appService.getById(userApp.getAppId());
        if(app == null) {
            map.put("msg", "该服务不存在!");
            map.put("code", "404");
            map.put("data", null);
            return map;
        }
        map.put("data", userAppService.save(userApp));
        map.put("code", 200);
        return map;
    }

    @PostMapping("/list-user")
    public Map listUserService() {
        Map map = new HashMap();

        List<UserAppVo> list = userAppService.getList(new QueryWrapper<UserAppVo>().eq("user_id", 1));
        map.put("code", 200);
        map.put("data", list);
        return map;
    }
}
