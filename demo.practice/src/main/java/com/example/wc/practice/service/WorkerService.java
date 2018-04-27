package com.example.wc.practice.service;

import java.util.List;
import com.example.wc.practice.model.*;

public interface WorkerService {
	
	boolean loginWorker(WorkerInfo workerinfo);
	
	void HandleApply(List<UserInfo> userinfo);//处理贷款申请

	List<UserInfo> GetAllUserInfo();

	void ModUserCredit(String idNum,String credit);

	void DeleteUser(String idNum);

	UserInfo GetUserInfoById(String idNum);

	UserInfo GetUserInfoByTel(String telNum);
}
