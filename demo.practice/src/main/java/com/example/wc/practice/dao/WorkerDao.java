package com.example.wc.practice.dao;

import java.util.List;

import com.example.wc.practice.modle.*;

public interface WorkerDao {
	boolean login_worker(String job_num, String password);
	
	List<UserInfo> GetUsetInfoById_num(String id_num); //�������֤��ѯ�û�
	
	boolean DealApply(List<UserInfo> userinfo, String amount);//�����������

}
