package org.OnlineExam.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
	
	/**
	 * This constructor is used to initialize elements everytime
	 * @param driver
	 */
	public CommonPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath = "//a[text()='Admin Login']") private WebElement clickOnAdmin;
	
	
	@FindBy(xpath = "//input[@name=\"uname\"]") private WebElement adminUsername;
	@FindBy(xpath = "(//input[@name=\"password\"])[3]") private WebElement adminPassword;
	@FindBy(xpath = "//input[@name=\"login\"]") private WebElement login;
	
	@FindBy(xpath = "//a[@class=\"log\"]") private WebElement signOut;
	
	//business library
			/**
		 * This method is used to perform login action
		 * @param email
		 * @param password
		 */
		public void Login(String username, String password) {
			clickOnAdmin.click();
			adminUsername.sendKeys(username);
			adminPassword.sendKeys(password);
			login.click();
		}
		
		public void logOut() {
			signOut.click();
		}
}