package com.example.wc.practice.model;

public class UserInfo {
	private int id; //主键id
	private String name; // 用户姓名
	private String sex; // 用户性别
	private int age; // 用户年龄
	private String idNum; // 用户身份证号
	private String telNum; // 用户电话号码
	private int credit; // 用户信用值
	private String balance; // 用户账户余额
	private String password; // 用户登录密码
	
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

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "userinfo{" + "id =" + id +
						", name = " + name + 
						", sex = " + sex + 
						", age = " + age + 
						", idNum = " + idNum + 
						", telNum = " + telNum + 
						", credit = " + credit + 
						", balance = " + balance + 
						", password = "
						+ password + '}';
	}

}
