package com.example.wc.practice.dao;

import java.util.List;

import com.example.wc.practice.modle.WorkerInfo;

public class AdminDaoImpl implements AdminDao{

	public boolean login_admin(String account, String password) {
		
		return false;
	}

	public void InsertWorkerInfo(WorkerInfo workerinfo) {
		
	}

	public void InsertWorkerInfos(List<WorkerInfo> workerinfo) {
		
	}

	public List<WorkerInfo> GetWorkerInfoByJob_num(String job_num) {
		
		return null;
	}

	public List<WorkerInfo> GetWorkerInfoByName(String name) {
		
		return null;
	}

	public void DeleteWorkerInfoByJob_num(String job_num) {
		
	}

	public void UpdateWorkerInfo(List<WorkerInfo> workerinfo) {
		
	}

	public boolean DealApply(String amount) {
		
		return false;
	}

	public String ViewMoney() {
		
		return null;
	}

}
