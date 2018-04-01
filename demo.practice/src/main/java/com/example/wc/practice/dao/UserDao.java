package com.example.wc.practice.dao;

import java.util.List;
import com.example.wc.practice.modle.*;


public interface UserDao {
	boolean login_user(String id_num, String password); //登陆
	
	boolean register(UserInfo user); //注册
	
	void InsertUserInfo(UserInfo userinfo); //添加用户信息
	
	void InsertUserInfos(List<UserInfo> userinfo); //添加用户全部信息
	
	List<UserInfo> GetUsetInfoById_num(String id_num); //根据身份证查询
	
	List<UserInfo> GetUsetInfoByTel_num(String tel_num); //根据电话号查询
	
	void DeleteUserInfoById_num(String id_num); //根据身份证删除用户
	
	void UpdateUserinfo(List<UserInfo> userinfo); //修改用户信息
	
	boolean ApplyLoan(List<UserInfo> userinfo, String amount); //申请贷款
	
	boolean SaveMoney(String id_num, String amount); //存钱
	
	boolean WithdrawMoney(String id_num, String amount); //取钱
}
