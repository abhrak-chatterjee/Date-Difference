package com.capgemini;

public class MyDateTestRecord 
{
	public MyDate startDate;
	public MyDate endDate;
	public long expecteResult;
	
	
	public MyDateTestRecord(MyDate startDate, MyDate endDate, int expecteResult) 
	{
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.expecteResult = expecteResult;
	}
	
}
