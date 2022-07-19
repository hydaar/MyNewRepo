package org.tyss.genericUtility;

import org.OnlineExam.objectRepository.WebdriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartOrRestartPage {
	/**
	 * This constructor is used to initialize elements everytime
	 * @param driver
	 */
	public StartOrRestartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//div[@class=\"panel\"]/form/input[@type=\"radio\"]") private WebElement radioBtn;
	@FindBy(xpath = "//button[@class=\"btn btn-primary\"]") private WebElement submit;
	
	@FindBy(xpath = "//div[@class=\"panel\"]") private WebElement getresults;
	
	
	
	
	//business library
	
	
	
	public void clickNext()
	{
		radioBtn.click();
		submit.click();
	}
	
	public void waittill(WebdriverUtility webdriverUtility, By locator, long time)
	{
		webdriverUtility.explicitwait(locator, time);
	}

	/**
	 * This method is used to take screenshot
	 * @param webdriverUtility
	 */
	public void takeSnap(WebdriverUtility webdriverUtility)
	{
		webdriverUtility.takesScreenShotElement(getresults);
	}
	
	
}
