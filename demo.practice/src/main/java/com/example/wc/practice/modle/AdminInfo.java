package com.example.wc.practice.modle;

public class AdminInfo {
	private int id; //����id
	private String account; //����Ա�˺�
	private String password; //����Ա��¼����
	private String name; //����Ա�ƺ�
	
	public void SetId(int id){
		this.id = id;
	}
	
	public int GetId(){
		return id;
	}
	
	public void SetAccount(String account){
		this.account = account;
	}
	
	public String GetAccount(){
		return account;
	}
	
	public void SetPassword(String password){
		this.password = password;
	}
	
	public String GetPassword(){
		return password;
	}
	
	public void SetName(String name){
		this.name = name;
	}
	
	public String GetName(){
		return name;
	}
	
	
	@Override public String toString(){
		return "admininfo{" +
				"id = " + id +
				", account = " + account +
				", password = " + password +
				", name = " + name +
 				'}';
	}
	

}
