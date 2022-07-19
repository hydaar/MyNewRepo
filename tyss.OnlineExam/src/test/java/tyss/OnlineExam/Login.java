package tyss.OnlineExam;
//org.OnlineExam.objectRepository

import org.OnlineExam.objectRepository.BaseClass;
import org.tyss.genericUtility.StartOrRestartPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Login extends BaseClass {

	@Test(groups="regression")
	public void login() {

		
		
		StartOrRestartPage startOrRestartPage = new StartOrRestartPage(driver);
		String quiz = excelUtility.getDataFromExcel("Quiz", 13, 1);
		System.out.println("modidief for GITHUB");
		
		
		driver.findElement(By.xpath("//td[text()='"+quiz+"']/ancestor::tr/td[6]")).click();
		String cu = webdriverUtility.fetchCurrentUrl();
		javaUtility.printStatement(cu);
		while(!cu.contains("n=5"))
		{
			startOrRestartPage.clickNext();
			cu = webdriverUtility.fetchCurrentUrl();
		}
		
		startOrRestartPage.clickNext();
		startOrRestartPage.takeSnap(webdriverUtility);
		System.out.println("modidief for GITHUB");
		
	}

}
