package com.example.wc.practice.dao;

import java.util.List;

import com.example.wc.practice.modle.*;

public class UserDaoImpl implements UserDao{

	public boolean login_user(String id_num, String password) {
		
		return false;
	}

	public boolean register(UserInfo user) {
		
		return false;
	}

	public void InsertUserInfo(UserInfo userinfo) {
		
	}

	public void InsertUserInfos(List<UserInfo> userinfo) {
		
	}

	public List<UserInfo> GetUsetInfoById_num(String id_num) {
		return null;
	}

	public void DeleteUserInfoById_num(String id_num) {
		
	}

	public void UpdateUserinfo(List<UserInfo> userinfo) {
		
	}

	public boolean ApplyLoan(List<UserInfo> userinfo, String amount) {
		
		return false;
	}

	public boolean SaveMoney(String id_num, String amount) {
		
		return false;
	}

	public boolean WithdrawMoney(String id_num, String amount) {
		
		return false;
	}

	public List<UserInfo> GetUsetInfoByTel_num(String tel_num) {
		
		return null;
	}

}
