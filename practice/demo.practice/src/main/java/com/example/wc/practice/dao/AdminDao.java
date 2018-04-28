package com.example.wc.practice.dao;

import java.util.List;

import com.example.wc.practice.model.*;

public interface AdminDao {

	void InsertWorkerInfo(WorkerInfo workerinfo); //添加工作人员信息

	WorkerInfo GetWorkerInfoByJobNum(String jobNum); //根据工号查询

	List<WorkerInfo> GetAllWorkerInfo(); //查询所有员工信息

	void DeleteWorkerInfoByJobNum(String jobNum); //根据工号删除

	void UpdateWorkerInfo(String jobNum); //修改工作人员信息

	AdminInfo SelectByAccountAndPassword(AdminInfo admininfo); //登陆

	String ViewMoney(); //查看资金
}
