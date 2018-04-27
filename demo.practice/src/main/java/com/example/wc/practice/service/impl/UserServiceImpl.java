package com.example.wc.practice.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wc.practice.model.*;
import com.example.wc.practice.service.*;
import com.example.wc.practice.dao.*;


@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public boolean loginUser(UserInfo userinfo) {
		UserInfo info = userDao.SelectByIdNumAndPassword(userinfo);
		if(info == null){
			return false;
		}else{
			return true;
		}
	}
	
	@Override
	public boolean register(UserInfo userinfo) {
		UserInfo info = userDao.InsertUserInfo(userinfo);
		if(info == null){
			return false;
		}else{
			return true;
		}
	}
	
	public UserInfo GetUserInfo(){
		return userDao.SelectUserInfo();
	}

	public int GetUserCounts(){
		return userDao.GetUserCounts();
	}

	public void ModUserCounts(int usercounts){
		userDao.ModUserCounts(usercounts);
	}

	public boolean ModUserInfo(UserInfo userinfo){
		if(userDao.UpdateUserinfo(userinfo) > 0){
		    return true;
        }else{
		    return false;
        }
	}

	public boolean ApplyLoan(String amount) {

		return false;
	}

	public String SaveMoney(String idNum, String amount) {
		String oldBalance = userDao.SelectBalanceFromUserInfo(idNum);
		Double nowBalance = Double.parseDouble(amount) + Double.parseDouble(oldBalance);
		String newBalance = String.valueOf(nowBalance);
		userDao.UpdateUserBalance(newBalance, idNum);
		return newBalance;
	}

	public boolean WithdrawMoney(String idNum, String amount) {
		BigDecimal take = new BigDecimal(amount);
		String oldBalance = userDao.SelectBalanceFromUserInfo(idNum);
		BigDecimal release = new BigDecimal(oldBalance);
		
		if(take.compareTo(release)<0){
			return false;
		}else{
			Double nowBalance = Double.parseDouble(oldBalance) - Double.parseDouble(amount);
			String newBalance = String.valueOf(nowBalance);
			userDao.UpdateUserBalance(newBalance, idNum);
			return true;
		}
	}

}
