package com.example.wc.practice.service;

import com.example.wc.practice.model.*;

import java.util.List;

public interface AdminService {
	
	boolean loginAdmin(AdminInfo admininfo);
	
	boolean DealApply(String amount); //批复申请

	public void AddWorkerInfo(WorkerInfo workerinfo);

	public WorkerInfo GetWorkerInfo(String jobNum);

	public List<WorkerInfo> GetAllWorkerInfo();

	public void DeleteWorker(String jobNum);

	public void ModWorkerInfo(String jobNum);

	public String ViewMoney();

}
