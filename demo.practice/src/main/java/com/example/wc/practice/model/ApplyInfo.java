package com.example.wc.practice.model;

public class ApplyInfo {
	private int id; //主键id
	private String name; //用户姓名
	private String id_num; //用户身份证号
	private String amount; //用户申请贷款金额
	private String loanflag; //用户贷款权限——0代表不可以，1代表可以
	
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
	public String getId_num() {
		return id_num;
	}
	public void setId_num(String id_num) {
		this.id_num = id_num;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getLoanFlag(){
		return loanflag;
	}
	public void setLoanflag(String loanflag){
		this.loanflag = loanflag;
	}
	
	@Override
	public String toString() {
		return "ApplyInfo [id=" + id + 
				", name=" + name + 
				", id_num=" + id_num + 
				", amount=" + amount +
				", loanflag=" + loanflag +
				"]";
	}
	

}
