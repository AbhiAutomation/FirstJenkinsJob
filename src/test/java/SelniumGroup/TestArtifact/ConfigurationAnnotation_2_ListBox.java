package SelniumGroup.TestArtifact;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation_2_ListBox {
	

	@Test
	public void test1() {
		System.out.println("         ==>TestMethod 1 ListBox ");

	}

	
	public void test2() {
		System.out.println("         ==>TestMethod 2 ListBox ");

	}

	
	public void test3() {
		System.out.println("          ==>TestMethod 3 ListBox ");

	}

	@BeforeMethod
	public void befoeMethod() {
		System.out.println("     (2) Execute befire each method  ListBox");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("     (2) Execute after  each method ListBox ");
	}
	
	@BeforeClass 
	public void beforClasss()
	{
		System.out.println("   (3) Execute Before Class ListBox ");
	
	}

	@AfterClass 
	public void afterClasss()
	{
		System.out.println("   (3) Execute after Class ListBox ");
	
	}
	
	@BeforeTest 
	public void beforTest()
	{
		System.out.println("   (7) Execute before each test ListBox ");
		
	}
	
	@AfterTest 
	public void afterTest()
	{
		System.out.println("   (7) Execute after each test ListBox ");
		
	}
	
	@BeforeSuite 
	public void beforeSuite()
	{
		System.out.println(" (9) Execute before the suite ListBox ");
		
	}
	@AfterSuite 
	public void afterSuite()
	{
		System.out.println(" (9) Execute after  the suite ListBox ");
		
	}
	
	@BeforeGroups(groups= {"regression","smoke"})
	public void beforeGroups()
	{
		System.out.println("(0) Execute before group ListBox ");
		
	}
	
	@AfterGroups(groups= {"regression","smoke"})
	public void afterGroups()
	{
		System.out.println("(0) Execute after  group ListBox ");
		
	}

}
