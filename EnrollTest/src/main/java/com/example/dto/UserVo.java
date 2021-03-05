package com.example.dto;


import java.sql.Date;
import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

//@Data
//@ToString
@Alias("UserVo")
public class UserVo {
	
	private Integer usersNo;
	private String usersId;
	private String usersPassword;
	private String usersTel;
	private String usersNickname;
	private String usersName;
	private String usersAddress;
	private String usersEmail;
	private Timestamp joinDate;
	private Timestamp modiDate;
	
	public UserVo() {
		System.out.println("uservo");
	
	}

	
	public Integer getUsersNo() {
		return usersNo;
	}


	public void setUsersNo(Integer usersNo) {
		this.usersNo = usersNo;
	}


	public String getUsersId() {
		return usersId;
	}


	public void setUsersId(String usersId) {
		this.usersId = usersId;
	}


	public String getUsersPassword() {
		return usersPassword;
	}


	public void setUsersPassword(String usersPassword) {
		this.usersPassword = usersPassword;
	}


	public String getUsersTel() {
		return usersTel;
	}


	public void setUsersTel(String usersTel) {
		this.usersTel = usersTel;
	}


	public String getUsersNickname() {
		return usersNickname;
	}


	public void setUsersNickname(String usersNickname) {
		this.usersNickname = usersNickname;
	}


	public String getUsersName() {
		return usersName;
	}


	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}


	public String getUsersAddress() {
		return usersAddress;
	}


	public void setUsersAddress(String usersAddress) {
		this.usersAddress = usersAddress;
	}


	public String getUsersEmail() {
		return usersEmail;
	}


	public void setUsersEmail(String usersEmail) {
		this.usersEmail = usersEmail;
	}


	public Timestamp getJoinDate() {
		return joinDate;
	}


	public void setJoinDate(Timestamp joinDate) {
		this.joinDate = joinDate;
	}


	public Timestamp getModiDate() {
		return modiDate;
	}


	public void setModiDate(Timestamp modiDate) {
		this.modiDate = modiDate;
	}


	@Override
	public String toString() {
		return "UserVo [usersNo=" + usersNo + ", usersId=" + usersId + ", usersPassword=" + usersPassword + ", usersTel="
				+ usersTel + ", usersNickname=" + usersNickname + ", usersName=" + usersName + ", usersAddress=" + usersAddress
				+ ", usersEmail=" + usersEmail + "]";
	}

	
}
