package com.capgemini;

import java.util.ArrayList;

public class DataDifferenceTest 
{
	public static void main(String[] args) 
	{
		ArrayList<MyDateTestRecord> testData = new ArrayList<> ();
		
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011),new MyDate(06, 04, 2011), 0));   //case 1
		
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011),new MyDate(18, 04, 2011), 12));  //case 2
		
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011),new MyDate(18, 05, 2011), 42));  //case 3
		
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011),new MyDate(18, 06, 2011), 73));  //case 4
		
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011),new MyDate(18, 12, 2011), 256));  //case 5
		
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011),new MyDate(18, 12, 2012), 622));  //case 6
		
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011),new MyDate(18, 12, 2013), 987));  //case 7
		
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011),new MyDate(18, 12, 2013), 37511));  //case 8
		
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011),new MyDate(18, 12, 2413), 147084));  //case 9
		
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011),new MyDate(18, 12, 2813), 293181));  //case 10
		
		testData.add(new MyDateTestRecord(new MyDate(06, 01, 2011),new MyDate(06, 03, 2011), 59));  //case 11
		
		testData.add(new MyDateTestRecord(new MyDate(06, 01, 2012),new MyDate(06, 03, 2012), 60));  //case 12
		
		testData.add(new MyDateTestRecord(new MyDate(06, 02, 2012),new MyDate(06, 03, 2012), 29));  //case 13
		
		testData.add(new MyDateTestRecord(new MyDate(22, 01, 2012),new MyDate(15, 11, 2012), 298));  //case 14
		
		testData.add(new MyDateTestRecord(new MyDate(06, 02, 2012),new MyDate(06, 12, 2012), 304));  //case 15
		
		for(MyDateTestRecord testCase : testData)
		{
			MyDate startDate = testCase.startDate;
			MyDate endDate = testCase.endDate;
			long expectedResult = testCase.expecteResult;
			long obtainedResult = DateDifferenceProvider.getDateDifference(startDate,endDate);
			
			if(expectedResult == obtainedResult)
			{
				System.out.println("Test " + (1 + testData.lastIndexOf(testCase)) + " Passed " + obtainedResult
						+ "= obtainedResult " + expectedResult + "= expectedResult");
			}
			else
			{
				System.err.println("Test " + (1 + testData.lastIndexOf(testCase)) + " Failed " + obtainedResult
						+ "= obtainedResult " + expectedResult + "= expectedResult");
			}
		}
	}
}
