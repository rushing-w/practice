package com.example.wc.practice.dao;

import com.example.wc.practice.model.*;

public interface UserDao {
	
	UserInfo SelectUserInfo(); //查询用户自身信息
	
	Integer UpdateUserinfo(UserInfo userinfo); //修改用户自身信息

	UserInfo SelectByIdNumAndPassword(UserInfo userinfo); //登陆
	
	UserInfo InsertUserInfo(UserInfo userinfo);
	
	void UpdateUserBalance(String balance, String idNum);
	
	String SelectBalanceFromUserInfo(String idNum);

	int GetUserCounts();

	void ModUserCounts(int usercounts);
}
