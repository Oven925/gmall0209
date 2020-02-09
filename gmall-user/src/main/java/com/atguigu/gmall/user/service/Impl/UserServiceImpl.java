package com.atguigu.gmall.user.service.Impl;



import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.service.UserService;
import com.atguigu.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public List<UmsMember> getUserById(String id) {
        UmsMember umsMember = new UmsMember();
        umsMember.setMemberLevelId(id);
        List<UmsMember> umsMembers = userMapper.select(umsMember);
        return umsMembers;
    }

}
