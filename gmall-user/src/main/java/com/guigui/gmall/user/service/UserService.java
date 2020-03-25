package com.guigui.gmall.user.service;

import com.guigui.gmall.user.bean.UmsMember;
import com.guigui.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();


    List<UmsMemberReceiveAddress> getUmsMemeberAddressBymemberId(String memberId);
}
