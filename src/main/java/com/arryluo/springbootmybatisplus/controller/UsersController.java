package com.arryluo.springbootmybatisplus.controller;



import com.arryluo.springbootmybatisplus.entity.Users;
import com.arryluo.springbootmybatisplus.service.INewtabService;
import com.arryluo.springbootmybatisplus.service.IUsersService;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author arryluo
 * @since 2018-12-26
 */
@Controller
@RequestMapping("/springbootmybatisplus/users")
public class UsersController {
    @Autowired
    private IUsersService userMapper;
    @Autowired
    private INewtabService newtabService;
    @RequestMapping("test")
    @ResponseBody
    public Object test(){
        //EntityWrapper
        Map<String,Object>map=new HashMap<>();
        map.put("username","gg");
        System.out.println(newtabService.list(new QueryWrapper<>()));
        return userMapper.listByMap(map);
    }
}
