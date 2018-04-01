package com.example.wc.practice.modle;

public class UserInfo {
	private String name; //用户姓名
	private String sex; //用户性别
	private int age; //用户年龄
	private String id_num; //用户身份证号
	private String tel_num; //用户电话号码
	private int credit; //用户信用值
	private String balance; //用户账户余额
	private String password; //用户登录密码
	
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
