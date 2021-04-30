package com.javalec.PanelUserStatistic;

public class US_Bean {
	
	//-----------------
	//Field 
	//-----------------
	String userName;
	String userResultM;
	String userResultA;
	String count;
	

	
	
	//-----------------
	//Construction
	//-----------------
	
	
	public US_Bean() {
	}


	public US_Bean( String userName, String userResultM, String userResultA) {
		super();
		this.userName = userName;
		this.userResultM = userResultM;
		this.userResultA = userResultA;
		
	}
	
	public US_Bean(String count) {
		this.count=count;
	}
	
	



	//-----------------
	//Method
	//-----------------	
	public String getUserResultM() {
		return userResultM;
	}



	public void setUserResultM(String userResultM) {
		this.userResultM = userResultM;
	}



	public String getUserResultA() {
		return userResultA;
	}



	public void setUserResultA(String userResultA) {
		this.userResultA = userResultA;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getCount() {
		return count;
	}


	public void setCount(String count) {
		this.count = count;
	}
		
	
		

}
