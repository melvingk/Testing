package com.qa.tax;

public class tax{
	
	double taxLookUp(int salary)
	{
	
	double tax=0;
	if (salary<=14999)
	
	{	tax=0;
		return tax;	
	}
	else if (salary>=15000 && salary<=19999)
	{
		tax=0.1;
		return tax;	
	}
	else if (salary>20000 && salary<29999)
	{
		
		tax=0.15;
		return tax;		
	}
	else if (salary>=30000 && salary<=44999)
	{
		
		tax=0.2;
		return tax;		
	}
	else if (salary>=45000)
	{
		
		tax=0.25;
		return tax;	
	}
		
		return tax;
		
	}



double calculate(int salary)
{
	
	double taxAmount= salary *(taxLookUp(salary));
	
	return taxAmount;
	
	
}

}