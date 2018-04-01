package com.example.wc.practice.modle;

public class WorkerInfo {
	private String name; //工作人员姓名
	private String sex; //工作人员性别
	private int age; //工作人员年龄
	private int workingyears; //工作人员工龄
	private String job_num; //工作人员工号
	private String tel_num; //工作人员电话号码
	private String password; //工作人员登录密码
	
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
	
	public void SetWorkingyears(int workingyears){
		this.workingyears = workingyears;
	}

	public int GetWorkingyeaes(){
		return workingyears;
	}
	
	public void SetJob_num(String job_num){
		this.job_num = job_num;
	}
	
	public String GetJob_num(){
		return job_num;
	}
	
	public void SetTel_num(String tel_num){
		this.tel_num = tel_num;
	}
	
	public String GetTel_num(){
		return tel_num;
	}
	
	public void SetPassword(String password){
		this.password = password;
	}
	
	public String GetPassword(){
		return password;
	}
	
	@Override public String toString(){
		return "workerinfo{" + 
				"name = " + name +
				", sex = " + sex +
				", age = " + age +
				", workingyears = " + workingyears +
				", job_num = " + job_num +
				", tel_num = " + tel_num +
				", password = " + password +
				'}';
	}
	
}
