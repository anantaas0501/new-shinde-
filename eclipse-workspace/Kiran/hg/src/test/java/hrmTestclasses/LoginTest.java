package hrmTestclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomclasses.LoginPage;

public class LoginTest  extends LoginPage{

	static WebDriver d;
	
	LoginPage log;
	public LoginTest(WebDriver d) {
		super(d);
		
	}

	@BeforeMethod
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91885\\ananta\\chromedriver.exe");
		 d = new ChromeDriver();
			d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			d.manage().deleteAllCookies();
			d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test
	public void VerifyLoginTest() {
		LoginPage log=new LoginPage(d);
		log.enterusername();
		log.enterpassword();
		log.Clickonloginbtn();
			
		
	}
	
	@AfterMethod
	
	public  void Teardown() {
		d.close();
	}
	
}