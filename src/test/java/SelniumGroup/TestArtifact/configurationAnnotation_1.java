package SelniumGroup.TestArtifact;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class configurationAnnotation_1 {
	@Test()
	public void test1() {
	
		System.out.println("         ==>TestMethod 1 ");

	}

	@Test(groups= {"regression","e2e"})
	public void test2() {
		
		System.out.println("         ==>TestMethod 2 ");

	}

	@Test(groups= {"smoke","e2e","regression"})
	public void test3() {
		System.out.println("          ==>TestMethod 3 ");

	}

	@BeforeMethod
	public void befoeMethod() {
		System.out.println("     (2) Execute befire each method ");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("     (2) Execute after  each method ");
	}
	
	@BeforeClass 
	public void beforClasss()
	{
		System.out.println("   (3) Execute Before Class ");
	
	}

	@AfterClass 
	public void afterClasss()
	{
		System.out.println("   (3) Execute after Class ");
	
	}

}
