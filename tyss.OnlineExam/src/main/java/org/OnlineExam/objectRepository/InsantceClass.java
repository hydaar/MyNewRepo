package org.OnlineExam.objectRepository;

import org.openqa.selenium.WebDriver;
/**
 * This class is used to create instance for running the scripts
 * @author DELL
 *
 */
public class InsantceClass {
	public WebDriver driver;
	public FilePathUtiltity filePathUtiltity;
	public ExcelUtility excelUtility;
	public JavaUtility javaUtility;
	public WebdriverUtility webdriverUtility;
	String url;
	String username;
	String password;
	String browser;
	String timeout;
	long time;
	protected CommonPage commonPage;

}
