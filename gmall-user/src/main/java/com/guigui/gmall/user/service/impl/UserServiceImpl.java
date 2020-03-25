package com.guigui.gmall.user.service.impl;

import com.guigui.gmall.user.bean.UmsMember;
import com.guigui.gmall.user.bean.UmsMemberReceiveAddress;
import com.guigui.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.guigui.gmall.user.mapper.UserMapper;
import com.guigui.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMember> getAllUser() {

        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getUmsMemeberAddressBymemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddressList;
    }
}
