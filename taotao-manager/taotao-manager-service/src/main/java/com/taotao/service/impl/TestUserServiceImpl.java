package com.taotao.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.mapper.TbUserMapper;
import com.taotao.pojo.TbUser;
import com.taotao.service.TestUserService;
@Service("testUserServiceImpl")
public class TestUserServiceImpl implements TestUserService{
	@Autowired
	private TbUserMapper tbUserMapper;

	@Override
	public TbUser testSelectUser(int id) {
		return tbUserMapper.testSelectUser(id);
	}

}
