package com.example.wc.practice.dao;

import java.util.List;
import com.example.wc.practice.modle.*;

public interface AdminDao {
	boolean login_admin(String account, String password);
	
	void InsertWorkerInfo(WorkerInfo workerinfo); //添加工作人员信息
	
	void InsertWorkerInfos(List<WorkerInfo> workerinfo); //添加工作人员全部信息
	
	List<WorkerInfo> GetWorkerInfoByJob_num(String job_num); //根据工号查询
	
	List<WorkerInfo> GetWorkerInfoByName(String name); //根据姓名查询
	
	void DeleteWorkerInfoByJob_num(String job_num); //根据工号删除
	
	void UpdateWorkerInfo(List<WorkerInfo> workerinfo); //修改工作人员信息
	
	boolean DealApply(String amount); //批复申请
	
	String ViewMoney(); //查看资金
	
}
