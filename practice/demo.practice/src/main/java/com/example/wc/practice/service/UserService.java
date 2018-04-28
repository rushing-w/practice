package com.example.wc.practice.service;

import com.example.wc.practice.model.UserInfo;

public interface UserService {

	boolean loginUser(UserInfo userinfo); //登陆

	boolean register(UserInfo user); //注册

	void ApplyLoan(String name, String idNum, String amount); //申请贷款

	String SaveMoney(String idNum, String amount); //存钱

	boolean WithdrawMoney(String idNum, String amount); //取钱

	UserInfo GetUserInfo(String idNum);

	public boolean ModUserInfo(UserInfo userinfo);

	int GetUserCounts();

	void ModUserCounts(int usercounts);


}
