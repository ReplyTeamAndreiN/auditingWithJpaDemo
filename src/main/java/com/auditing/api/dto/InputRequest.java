package com.auditing.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class InputRequest<T> {
	
	@JsonProperty(value = "userId", required = true)
	private String loggedInUser;
	private String timeZone;
	private T employee;
	public String getLoggedInUser() {
		return loggedInUser;
	}
	public void setLoggedInUser(String loggedInUser) {
		this.loggedInUser = loggedInUser;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public T getEmployee() {
		return employee;
	}
	public void setEmployee(T employee) {
		this.employee = employee;
	}
	
	
}
