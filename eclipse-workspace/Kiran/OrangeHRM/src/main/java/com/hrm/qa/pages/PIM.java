package com.hrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.testbase.Testbase;

public class PIM extends Testbase {

	
	@FindBy(xpath="(//input[@type='checkbox']/following::span/child::i)[2]")
	private WebElement Firstinputcheckbox;
	
	@FindBy(xpath="(//div[@class='oxd-table-cell oxd-padding-cell']/following-sibling::div/div/button/i)[1]")
	private WebElement delete;
	//button[@type='button']/following::button)[88]
	
	@FindBy(xpath="(//button[@type='button']/following::button)[88]")
	private WebElement Yesbutton;
	 WebDriver d;

	public PIM(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d, this);

	}
	

	public void selectfirstcheck() {
		Firstinputcheckbox.click();
	}

	public void Clickondeletebutton() throws InterruptedException {
		delete.click();
		Thread.sleep(5000);
		
	}
	
	public void Clickonyesbtn() {
		WebElement as=d.findElement(By.xpath("(//button[@type='button']/following::button)[88]"));
		JavascriptExecutor js = (JavascriptExecutor)d;
    	js.executeScript("arguments[0].click();",Yesbutton);

 
		
		
	
	
	}
	
	
}
