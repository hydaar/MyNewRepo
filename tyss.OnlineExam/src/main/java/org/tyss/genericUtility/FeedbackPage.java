package org.tyss.genericUtility;

import org.OnlineExam.objectRepository.WebdriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeedbackPage {

	/**
	 * This constructor is used to initialize elements everytime
	 * @param driver
	 */
	public FeedbackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Feedback']") private WebElement feedback;
	private String slno="5";
	private String dynxpath= ("//tr/td[text()='"+slno+"']/ancestor::tr/td[7]");
	@FindBy(xpath = "//div[@class=\"mCustomScrollbar\"]") private WebElement fetchText;
	
	@FindBy(xpath = "//tr[2]/td[8]") private WebElement folderDelete;
	@FindBy(xpath = "//a[text()='Home']") private WebElement clickOnHome;
	@FindBy(xpath = "//tr[5]/td[6]/b/a") private WebElement clickOnStart;
	@FindBy(xpath = "//span[@class=\"glyphicon glyphicon-list-alt\"]") private WebElement history;
	
	@FindBy(xpath = "//div[@class=\"panel title\"]") private WebElement historyPage;
	
	//business libray
	public void feedbackModule()
	{
		feedback.click();
		
	}
	
	public String feedbackfoldertext()
	{
		return fetchText.getText();
	}
	
	public void deleteFolder(WebdriverUtility webdriverUtility)
	{
		folderDelete.click();
		clickOnHome.click();
		clickOnStart.click();
		history.click();
		webdriverUtility.takesScreenShotElement(historyPage);
		
	}
	
	

}
