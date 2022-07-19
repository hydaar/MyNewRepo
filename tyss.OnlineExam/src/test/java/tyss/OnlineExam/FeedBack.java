package tyss.OnlineExam;

import org.OnlineExam.objectRepository.BaseClass;
import org.tyss.genericUtility.FeedbackPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FeedBack extends BaseClass {
	
	@Test(groups="regression")
	public void feedBack() {
		// TODO Auto-generated method stub
		
		//Calling method using POM class
		
		FeedbackPage feedbackPage = new FeedbackPage(driver);
		
		feedbackPage.feedbackModule();
		String slno="5";
		driver.findElement(By.xpath("//tr/td[text()='"+slno+"']/ancestor::tr/td[7]"));
		String text=feedbackPage.feedbackfoldertext();
		System.out.println(text);
		feedbackPage.deleteFolder(webdriverUtility);
		
	}

}
