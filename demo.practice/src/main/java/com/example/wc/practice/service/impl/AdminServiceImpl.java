package com.example.wc.practice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wc.practice.dao.*;
import com.example.wc.practice.model.*;
import com.example.wc.practice.service.*;


@Service("adminService")
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminDao adminDao;
	
	@Override  
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
