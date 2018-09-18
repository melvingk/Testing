package com.qa.blackJack;


public class blackJack {


// condition for blackjack where whichever is closer to 21 without going over
// 21. If they both go over 21 then return 0 	
	int numbers (int a, int b)
	{
		if (a>21 && b>21)
		{
			return 0;
		}
		else if (a>21)
		{
			return b;
		}
		else if (b>21)
		{
			return a;
		}
		
		return Math.max(a,b);
		
		
		
	}
	
//		if (a<=21 && b<=21)
//			{if (a>b)
//				{ 
//					return a;
//				}
//		else 
//	    	{
//				return b;
//	    	}
//		
//		}
//		else if (a>=21 && b<21)
//		{
//			return b;
//		}
//		else if (a<21 && b>=21)
//		{
//			return a;
//		}
//		else
//		{
//			return 0;
//		}	}
//	
//		
//	
	
	
	
}

