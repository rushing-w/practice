package com.example.wc.practice.dao;

import java.util.List;
import com.example.wc.practice.modle.*;

public interface AdminDao {
	boolean login_admin(String account, String password);
	
	void InsertWorkerInfo(WorkerInfo workerinfo); //��ӹ�����Ա��Ϣ
	
	void InsertWorkerInfos(List<WorkerInfo> workerinfo); //��ӹ�����Աȫ����Ϣ
	
	List<WorkerInfo> GetWorkerInfoByJob_num(String job_num); //���ݹ��Ų�ѯ
	
	List<WorkerInfo> GetWorkerInfoByName(String name); //����������ѯ
	
	void DeleteWorkerInfoByJob_num(String job_num); //���ݹ���ɾ��
	
	void UpdateWorkerInfo(List<WorkerInfo> workerinfo); //�޸Ĺ�����Ա��Ϣ
	
	boolean DealApply(String amount); //��������
	
	String ViewMoney(); //�鿴�ʽ�
	
}
