package com.example.wc.practice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wc.practice.dao.*;
import com.example.wc.practice.model.*;
import com.example.wc.practice.service.*;

@Service("workerService")
public class WorkerServiceImpl implements WorkerService{

	@Autowired
	WorkerDao workerDao;
	
	@Override
	public boolean loginWorker(WorkerInfo workerinfo) {
		WorkerInfo info = workerDao.SelectByJobNumAndPassword(workerinfo);
		if(info == null){
			return false;
		}else{
			return true;
		}
	}
	
	public UserInfo GetUserInfoById(String idNum){
		return workerDao.GetUserInfoByIdNum(idNum);
	}
	
	public UserInfo GetUserInfoByTel(String telNum){
		return workerDao.GetUserInfoByTelNum(telNum);
	}
	
	public List<UserInfo> GetAllUserInfo(){
		return workerDao.GetAllUserInfo();
	}
	
	public void ModUserCredit(String idNum, String credit){
		workerDao.UpdateUserCredit(idNum, credit);
	}
	
	public void DeleteUser(String idNum){
		workerDao.DeleteUserInfoByIdNum(idNum);
	}

	public boolean HandleApply(List<UserInfo> userinfo, String amount) {
		
		return false;
	}

}
