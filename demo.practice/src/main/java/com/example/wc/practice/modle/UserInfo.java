package com.example.wc.practice.modle;

public class UserInfo {
	private String name; //�û�����
	private String sex; //�û��Ա�
	private int age; //�û�����
	private String id_num; //�û����֤��
	private String tel_num; //�û��绰����
	private int credit; //�û�����ֵ
	private String balance; //�û��˻����
	private String password; //�û���¼����
	
	public void SetName(String name){
		this.name = name;
	}
	
	public String GetName(){
		return name;
	}
	
	public void SetSex(String sex){
		this.sex = sex;
	}
	
	public String GetSex(){
		return sex;
	}
	
	public void SetAge(int age){
		this.age = age;
	}
	
	public int GetAge(){
		return age;
	}
	
	public void SetId_num(String id_num){
		this.id_num = id_num;
	}
	
	public String GetId_num(){
		return id_num;
	}
	
	public void SetTel_num(String tel_num){
		this.tel_num = tel_num;
	}
	
	public String GetTel_num(){
		return tel_num;
	}

	public void SetCredit(int credit){
		this.credit = credit;
	}
	
	public int GetCredit(){
		return credit;
	}
	
	public void SetBalance(String balance){
		this.balance = balance;
	}
	
	public String GetBalance(){
		return balance;
	}
	
	public void SetPassword(String password){
		this.password = password;
	}
	
	public String GetPassword(){
		return password;
	}
	
	@Override public String toString(){
		return "userinfo{" + 
				"name = " + name +
				", sex = " + sex + 
				", age = " + age +
				", id_num = " + id_num +
				", tel_num = " + tel_num +
				", credit = " + credit +
				", balance = " + balance +
				", password = " + password +
				'}';
	}
	
	
}
