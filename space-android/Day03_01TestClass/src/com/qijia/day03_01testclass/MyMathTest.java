package com.qijia.day03_01testclass;

import android.test.AndroidTestCase;

public class MyMathTest extends AndroidTestCase {
	
	public void testadd() {
		MyMath mt = new MyMath();
		int result =mt.add(10, 90);
		assertEquals(100, result);
	}
	
}
