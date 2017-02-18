package com.mlaz.common.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.mlaz.common.mlenum.MlUserSource;

@DynamoDBTable(tableName = "MlazUser")
public class MlazUser {
	
	private String userName;
	
	private String firstName;
	
	private String lastName;
	
	private String emailAdrress;
	
	private MlUserSource originSource;
	
	@DynamoDBHashKey(attributeName = "userId")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@DynamoDBAttribute
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@DynamoDBAttribute
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@DynamoDBAttribute
	public String getEmailAdrress() {
		return emailAdrress;
	}

	public void setEmailAdrress(String emailAdrress) {
		this.emailAdrress = emailAdrress;
	}

	@DynamoDBAttribute
	public MlUserSource getOriginSource() {
		return originSource;
	}

	public void setOriginSource(MlUserSource originSource) {
		this.originSource = originSource;
	}
	
}
