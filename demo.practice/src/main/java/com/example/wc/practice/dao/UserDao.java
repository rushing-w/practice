package com.example.wc.practice.dao;

import java.util.List;
import com.example.wc.practice.modle.*;


public interface UserDao {
	boolean login_user(String id_num, String password); //��½
	
	boolean register(UserInfo user); //ע��
	
	void InsertUserInfo(UserInfo userinfo); //����û���Ϣ
	
	void InsertUserInfos(List<UserInfo> userinfo); //����û�ȫ����Ϣ
	
	List<UserInfo> GetUsetInfoById_num(String id_num); //�������֤��ѯ
	
	List<UserInfo> GetUsetInfoByTel_num(String tel_num); //���ݵ绰�Ų�ѯ
	
	void DeleteUserInfoById_num(String id_num); //�������֤ɾ���û�
	
	void UpdateUserinfo(List<UserInfo> userinfo); //�޸��û���Ϣ
	
	boolean ApplyLoan(List<UserInfo> userinfo, String amount); //�������
	
	boolean SaveMoney(String id_num, String amount); //��Ǯ
	
	boolean WithdrawMoney(String id_num, String amount); //ȡǮ
}
