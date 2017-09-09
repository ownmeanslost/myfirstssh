package com.report.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myfirstssh.resume.dao.UserInfoDao;
import com.myfirstssh.resume.model.UserInfo;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:testconfig/applicationContext.xml" }) 
public class DaoTest {
	@Autowired
	UserInfoDao userDao;
	@Test
	public void demo(){
		UserInfo userInfo=new UserInfo();
		userInfo.setGuid("82fe90ce-e22e-4cb2-bb01-bbc24cd26dce");
	//System.out.println(userInfo.getGuid());
		userDao.save(userInfo);
	}
}
