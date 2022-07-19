package org.OnlineExam.objectRepository;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass extends InsantceClass{
	
	/**
	 * This method is used to open browser ands url
	 */

	@BeforeClass(groups="regression")
	public void classSetup() {
		//Creating objects for GenericUtility
		filePathUtiltity = new FilePathUtiltity();
		excelUtility= new ExcelUtility();
		javaUtility= new JavaUtility();
		webdriverUtility= new WebdriverUtility();

		//Initialize data from Property file
		filePathUtiltity.intializePropetiesFile(IpathConstants.ATTENDANCEPROPERTIYFILE);
		excelUtility.initializeExcelFile(IpathConstants.ATTENDANCEXCELFILE);


		//Fetch the data from Property file
		url=filePathUtiltity.getDataFromProperty("url");
		username = filePathUtiltity.getDataFromProperty("username");
		password = filePathUtiltity.getDataFromProperty("password");
		browser=filePathUtiltity.getDataFromProperty("browser");
		timeout=filePathUtiltity.getDataFromProperty("timeouts");

		//covert string to long
		time = javaUtility.convertStringToLong(timeout);
		//run time polymorphism
		driver=webdriverUtility.Webdriversetupdriver(browser);

		//pre-setting for browser
		webdriverUtility.maximizeBrowser();
		webdriverUtility.implicitwait(time);

		//Create object for POM repo class
		commonPage= new CommonPage(driver);
	
				
		//navigate the application
		webdriverUtility.enterUrl(url);


	}
	/**
	 * This method is used to login into application
	 */
	@BeforeMethod(groups="regression")
	public void loginSetup()
	{
		//Logging into the application
		commonPage.Login(username, password);
				
	}
	/**
	 * This method is used to logout from application
	 */
	@AfterMethod(groups="regression")
	public void methodTearDown()
	{
		//Closing the workbook and driver
		commonPage.logOut();
		
	}

	@AfterClass(groups="regression")
	public void classTearDown()
	{

		excelUtility.closeExcelSheet();
		webdriverUtility.closeBrowser();
	}





}
