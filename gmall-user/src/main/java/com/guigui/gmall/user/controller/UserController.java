package com.guigui.gmall.user.controller;

import com.guigui.gmall.user.bean.UmsMember;
import com.guigui.gmall.user.bean.UmsMemberReceiveAddress;
import com.guigui.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController  {
    @Autowired
    UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        return userService.getAllUser();
    }

    @RequestMapping("getUmsMemeberAddressBymemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getUmsMemeberAddressBymemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getUmsMemeberAddressBymemberId(memberId);
        return umsMemberReceiveAddresses;
    }
}
