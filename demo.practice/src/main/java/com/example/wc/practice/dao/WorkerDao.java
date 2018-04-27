package com.example.wc.practice.dao;

import java.util.List;

import com.example.wc.practice.model.*;

public interface WorkerDao {

	UserInfo GetUserInfoByIdNum(String idNum); //根据身份证查询用户
	
	UserInfo GetUserInfoByTelNum(String telNum); //根据电话号查询
	
	List<UserInfo> GetAllUserInfo(); //查询所有用户信息
	
	void UpdateUserCredit(String idNum, String credit); //更新用户信用
	
	void DeleteUserInfoByIdNum(String idNum); //根据身份证删除用户

	WorkerInfo SelectByJobNumAndPassword(WorkerInfo workerinfo); //登陆
}
