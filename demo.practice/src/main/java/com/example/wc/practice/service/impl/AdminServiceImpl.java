package com.example.wc.practice.service.impl;

import java.util.List;

import com.example.wc.practice.dao.AdminDao;
import com.example.wc.practice.model.AdminInfo;
import com.example.wc.practice.model.WorkerInfo;
import com.example.wc.practice.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service("adminService")
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDao adminDao;
	
	public boolean loginAdmin(AdminInfo admininfo) {
		AdminInfo info = adminDao.SelectByAccountAndPassword(admininfo);
		if(info == null){
			return false;
		}else{
			return true;
		}
		
	}
	
	public void AddtWorkerInfo(WorkerInfo workerinfo){

		adminDao.InsertWorkerInfo(workerinfo);
	}
	
	public WorkerInfo GetWorkerInfo(String jobNum){

		return adminDao.GetWorkerInfoByJobNum(jobNum);
	}
	
	public List<WorkerInfo> GetAllWorkerInfo(){

		return adminDao.GetAllWorkerInfo();
	}

	public void DeleteWorker(String jobNum){

		adminDao.DeleteWorkerInfoByJobNum(jobNum);
	}
	
	public void ModWorkerInfo(String jobNum){

		adminDao.UpdateWorkerInfo(jobNum);
	}

	public String ViewMoney(){

	     return adminDao.ViewMoney();
    }
	
	public boolean DealApply(String amount) {
		
		return false;
	}

}
