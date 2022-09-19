package hrmTestclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomclasses.LoginPage;
import pomclasses.PIM;

public class PIMTest {

	 PIM pim;
	LoginPage log;
	static WebDriver d;
	public PIMTest() {
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91885\\ananta\\chromedriver.exe");
		 d = new ChromeDriver();
			d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			d.manage().deleteAllCookies();
			d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		log=new LoginPage (d);
		log.enterusername();
		Thread.sleep(3000);
		log.enterpassword();
		log.Clickonloginbtn();
		
	}
	
	@Test
	public void Verifyuserisdeleted() throws InterruptedException {
		 pim=new PIM(d);
		Thread.sleep(3000);
		pim.selectfirstcheck();
		Thread.sleep(3000);
		pim.Clickondeletebutton();
		Thread.sleep(3000);
		pim.Clickonyesbtn();
		
		
	}

//	
	@AfterMethod
	public void SuiteTeardown() {
		d.quit();
	}
}
