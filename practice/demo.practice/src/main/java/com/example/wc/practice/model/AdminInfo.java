package com.example.wc.practice.model;

public class AdminInfo {
	private int id; // 主键id
	private String account; // 管理员账号
	private String password; // 管理员登录密码
	private String name; // 管理员称呼

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "admininfo{" + 
				"id = " + id + 
				", account = " + account + 
				", password = " + password + 
				", name = " + name
				+ '}';
	}

}
