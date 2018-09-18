package com.qa.tax;

import org.junit.Test;

import junit.framework.TestCase;

public class taxTest extends TestCase
{
	
	@Test
	public void test() 
	{
        tax t= new tax();
        assertEquals(0.0, t.taxLookUp(1000));
        assertEquals(0.1, t.taxLookUp(15000));
        assertEquals(0.15, t.taxLookUp(21500));
        assertEquals(0.2, t.taxLookUp(35700));
        assertEquals(0.25, t.taxLookUp(55000));
        
		
        
     
        
		
}

}
