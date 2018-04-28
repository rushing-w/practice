package com.example.wc.practice.model;

public class WorkerInfo {
	private int id; //主键id
	private String name; // 工作人员姓名
	private String sex; // 工作人员性别
	private int age; // 工作人员年龄
	private int workingyears; // 工作人员工龄
	private String jobNum; // 工作人员工号
	private String telNum; // 工作人员电话号码
	private String password; // 工作人员登录密码
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWorkingyears() {
		return workingyears;
	}

	public void setWorkingyears(int workingyears) {
		this.workingyears = workingyears;
	}

	public String getJobNum() {
		return jobNum;
	}

	public void setJobNum(String jobNum) {
		this.jobNum = jobNum;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "workerinfo{" + "id = " + id +
				", name = " + name + 
				", sex = " + sex + 
				", age = " + age + 
				", workingyears = " + workingyears + 
				", jobNum = " + jobNum + 
				", telNum = " + telNum + 
				", password = " + password + '}';
	}

}
