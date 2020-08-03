package com.in28minutes.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
	MyMath myMath = new MyMath();
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@Test
	public void sum_with3numbers() {
		int result = myMath.sum(new int[] {1,2,3});
		System.out.println("test1");
		assertEquals(6, result);
	}
	
	@Test
	public void sum_with1numbers() {
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] {3});
		System.out.println("test2");
		assertEquals(3, result);
	}
}
