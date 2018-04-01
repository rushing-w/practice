package com.example.wc.practice.dao;

import java.util.List;

import com.example.wc.practice.modle.*;

public interface WorkerDao {
	boolean login_worker(String job_num, String password);
	
	List<UserInfo> GetUsetInfoById_num(String id_num); //根据身份证查询用户
	
	boolean DealApply(List<UserInfo> userinfo, String amount);//处理贷款申请

}
