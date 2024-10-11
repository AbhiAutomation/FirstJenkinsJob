package SelniumGroup.TestArtifact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest {

	public static WebDriver driver;

	@Parameters({"Browser"})
	@BeforeSuite
	public void setUp(@Optional("edge")String browserName) {
		System.out.println("Paramer value is" + browserName);

		if (browserName.equalsIgnoreCase("chrome"))		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} 
		else if (browserName.contains("edge"))		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

	}

	@Test
	public void test1() throws Throwable {

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Assert.isTrue(driver.getTitle().contains("OrangeHRM"), "Titiledoes not match ");
		Thread.sleep(10000);
	}

	@AfterSuite
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
