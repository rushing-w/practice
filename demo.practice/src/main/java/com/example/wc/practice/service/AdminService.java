package com.example.wc.practice.service;

import com.example.wc.practice.model.*;

public interface AdminService {
	
	boolean loginAdmin(AdminInfo admininfo);
	
	boolean DealApply(String amount); //批复申请
}
