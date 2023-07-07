package day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_LearningChild extends TestNg_Learning {
	
//	@BeforeMethod
//	void method1() {
//		System.out.println("Child_BeforeMethod");
//	}
	
	@BeforeClass
	void method2() {
		System.out.println("Child_BeforeClass");
	}
	@BeforeTest
	void method3() {
		System.out.println("Child_BeforeTest");
	}
	@BeforeSuite
	void method4() {
		System.out.println("Child_BeforeSuite");
	}
	
	
	@Test
	void method0() {
		System.out.println("Child_TestMethod");
	}
	
	@AfterMethod
	void method5() {
		System.out.println("Child_AfterMethod");
	}
	@AfterClass
	void method6() {
		System.out.println("Child_AfterClass");
	}
	@AfterTest
	void method7() {
		System.out.println("Child_AfterTest");
	}
	@AfterSuite
	void method8() {
		System.out.println("Child_AfterSuite");
	}
}
