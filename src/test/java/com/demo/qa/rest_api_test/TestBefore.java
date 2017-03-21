package com.demo.qa.rest_api_test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestBefore {

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(this.getClass().getName() + ":beforetest");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(this.getClass().getName() + ":afterMethod");
  }


  @BeforeClass
  public void beforeClass() {
	  System.out.println(this.getClass().getName() + ":beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println(this.getClass().getName() + ":afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(this.getClass().getName() + ":beforeTest");
  }
  
  @Test
  public void testFuncOne() {
	  System.out.println(this.getClass().getName() + ":Test1");
  }
  
  @Test
  public void testFuncTwo() {
	  System.out.println(this.getClass().getName() + ":Test2");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(this.getClass().getName() + ":afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println(this.getClass().getName() + ":beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println(this.getClass().getName() + ":afterSuite");
  }

}
