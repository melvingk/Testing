package com.qa.tax;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class TaxTest2 {	
	
	

@Parameters 
public static Collection<Object[]> data() {
return Arrays.asList(new Object[][]{{1000, 0.0}, {15000, 0.1}, {21500, 0.15}, {35700, 0.2}});
}
	
private int intPut;
private double intPected;


public TaxTest2 (int input, double expected) 
{
intPut = input;
intPected = expected;
} 

@Test
	public void test() {
	tax look= new tax();
		assertEquals(intPected, look.taxLookUp(intPut), 0.1 );
	}

}
