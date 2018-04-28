package com.example.wc.practice.model;

public class BankInfo {
	private int id; // 主键id
	private String money; // 银行资金
	private String name; // 银行名称
	private int usercounts; // 用户个数

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUsercounts(){
		return usercounts;
	}

	public void setUsercounts(int usercounts){
		this.usercounts = usercounts;
	}

	@Override
	public String toString() {
		return "BankInfo [id=" + id + 
						", money=" + money + 
						", name=" + name +
						", usercounts=" + usercounts +"]";
	}

}
