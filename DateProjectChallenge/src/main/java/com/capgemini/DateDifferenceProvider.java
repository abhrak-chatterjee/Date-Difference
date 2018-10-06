package com.capgemini;

public class DateDifferenceProvider 
{
	public static int getDateDifference(MyDate startDate, MyDate endDate)
	{
		int month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int leapMonth[] = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		int days = 0,i,j;
		
		int startDay = startDate.getDd();
		int startMonth = startDate.getMm();
		int startYear = startDate.getYyyy();
		int totalStartDays = 0;
		
		int endDay = endDate.getDd();
		int endMonth = endDate.getMm();
		int endYear = endDate.getYyyy();
		int totalEndDays = 0;
		
		for(i=2010;i<startYear;i++)
		{
			if(leapYear(i) == true)
			{
				for(j=1;j<=12;j++)
				{
					totalStartDays = totalStartDays + leapMonth[j];
				}
				//totalStartDays = totalStartDays + 1;
			}
			else
			{
				for(j=1;j<=12;j++)
				{
					totalStartDays = totalStartDays + month[j];
				}
			}
		}
		
		for(i=2010;i<endYear;i++)
		{
			if(leapYear(i) == true)
			{
				for(j=1;j<=12;j++)
				{
					totalEndDays = totalEndDays + leapMonth[j];
				}
			}
			else
			{
				for(j=1;j<=12;j++)
				{
					totalEndDays = totalEndDays + month[j];
				}
			}
		}
		
		if(leapYear(startYear) == true)
		{
			for(i=1;i<startMonth;i++)
			{
				totalStartDays += leapMonth[i]; 
			}
			totalStartDays = totalStartDays + startDay;
		}
		else
		{
			for(i=1;i<startMonth;i++)
			{
				totalStartDays += month[i]; 
			}
			totalStartDays += startDay;
		}	
		
		if(leapYear(endYear) == true)
		{
			for(i=1;i<endMonth;i++)
			{
				totalEndDays += leapMonth[i]; 
			}
			totalEndDays = totalEndDays + endDay;
		}
		else
		{
			for(i=1;i<endMonth;i++)
			{
				totalEndDays += month[i]; 
			}
			totalEndDays += endDay;
		}
		
		days = totalEndDays - totalStartDays;
		return days;
	}
	
	public static boolean leapYear(int year)
	{
		boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
        return leap;
	}
	
}