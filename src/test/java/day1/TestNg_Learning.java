package day1;

import org.testng.annotations.*;

public class TestNg_Learning {
	
	@BeforeMethod
	void method1() {
		System.out.println("Parent_BeforeMethod");
	}
	
	@BeforeClass
	void method2() {
		System.out.println("Parent_BeforeClass");
	}
	@BeforeTest
	void method3() {
		System.out.println("Parent_BeforeTest");
	}
	@BeforeSuite
	void method4() {
		System.out.println("Parent_BeforeSuite");
	}
	
	
	@Test
	void method0() {
		System.out.println("Parent_TestMethod");
	}
	
	@AfterMethod
	void method5() {
		System.out.println("Parent_AfterMethod");
	}
	@AfterClass
	void method6() {
		System.out.println("Parent_AfterClass");
	}
	@AfterTest
	void method7() {
		System.out.println("Parent_AfterTest");
	}
	@AfterSuite
	void method8() {
		System.out.println("Parent_AfterSuite");
	}
	
	
	
}