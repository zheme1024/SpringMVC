package com.z.bean;

import java.util.ArrayList;

public class QueryVO {
	private User user;
	private ArrayList<User> userList;
	private Integer maxresult;
	
	public Integer getMaxresult() {
		return maxresult;
	}
	public void setMaxresult(Integer maxresult) {
		this.maxresult = maxresult;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ArrayList<User> getUserList() {
		return userList;
	}
	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}
	
	@Override
	public String toString() {
		return "QueryQV [user=" + user + ", userList=" + userList
				+ ", MaxResult=" + maxresult + "]";
	}

}
