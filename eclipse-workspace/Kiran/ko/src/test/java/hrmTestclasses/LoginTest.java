package hrmTestclasses;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pomclasses.LoginPage;





public class LoginTest  {

	LoginPage log;
	static WebDriver d;
	public LoginTest() {
		super();
	}
	@BeforeMethod
	public void setUp()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91885\\ananta\\chromedriver.exe");	
		d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test 
	public void VerifyLoginTest() throws InterruptedException {
		log =new LoginPage (d);
		log.enterusername();
		Thread.sleep(3000);
		log.enterpassword();
		Thread.sleep(3000);
		log.Clickonloginbtn();
	}

	@AfterMethod
	public void SuiteTeardown() {
		d.quit();
	}


}
	
