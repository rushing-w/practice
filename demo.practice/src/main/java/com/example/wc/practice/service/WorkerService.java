package com.example.wc.practice.service;

import java.util.List;
import com.example.wc.practice.model.*;

public interface WorkerService {
	
	boolean loginWorker(WorkerInfo workerinfo);
	
	boolean HandleApply(List<UserInfo> userinfo, String amount);//处理贷款申请
}
