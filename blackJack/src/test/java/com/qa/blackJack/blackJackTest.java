package com.qa.blackJack;

import org.junit.Test;

import junit.framework.TestCase;

public class blackJackTest extends TestCase {
	
	@Test
	public void test() 
	{
		blackJack b= new blackJack();
		assertEquals(10, b.numbers(10, 22));
		assertEquals (19,b.numbers(25, 19));
		assertEquals (11,b.numbers(11, 30));
		assertEquals (11,b.numbers(11, 9));
		assertEquals (19,b.numbers(5, 19));
		
	}

}
