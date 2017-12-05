/**
 * Dec 5, 2017
 */
package com.humin.sm_test.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.humin.sm_test.bean.User;
import com.humin.sm_test.mapper.UserMapper;

/** 
 * @ClassName: SMTest 
 * @Description: 
 * @author humin 
 * @date Dec 5, 2017 5:09:22 PM 
 *  
 */
@RunWith(SpringJUnit4ClassRunner.class)//使用Springtest测试框架
@ContextConfiguration("/beans.xml")//加载配置
public class SMTest {
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void addTest(){
		User user = new User(-1, "zs", new Date(), 5000);
		userMapper.save(user);
		
	}
	
	@Test
	public void updateTest(){
		User user = new User(1, "ls", new Date(), 88888);
		userMapper.update(user);
	}
}
