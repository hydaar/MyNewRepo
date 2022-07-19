package org.tyss.genericUtility;

import org.OnlineExam.objectRepository.WebdriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuizPage {
	/**
	 * This constructor is used to initialize elements everytime
	 * @param driver
	 */
	public QuizPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class=\"dropdown-toggle\"]") private WebElement clickonQuiz;
	@FindBy(xpath = "//a[text()='Add Quiz']") private WebElement addQuiz;
	@FindBy(xpath = "//input[@placeholder=\"Enter Quiz title\"]") private WebElement enterQuizTitle;
	@FindBy(xpath = "//input[@placeholder=\"Enter total number of questions\"]") private WebElement enterQuestions;
	@FindBy(xpath = "//input[@placeholder=\"Enter marks on right answer\"]") private WebElement enterRightmark;
	@FindBy(xpath = "//input[@placeholder=\"Enter minus marks on wrong answer without sign\"]") private WebElement enterWrongmark;
	@FindBy(xpath = "//input[@placeholder=\"Enter time limit for test in minute\"]") private WebElement enterTimeLimit;
	@FindBy(xpath = "//textarea[@placeholder=\"Write description here...\"]") private WebElement enterDescription;
	@FindBy(xpath = "//input[@type=\"submit\"]") private WebElement submitBtn;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Write question number 1 here...\"]") private WebElement writeQuestion;
	@FindBy(xpath = "//input[@placeholder=\"Enter option a\"]") private WebElement option1;
	@FindBy(xpath = "//input[@placeholder=\"Enter option b\"]") private WebElement option2;
	@FindBy(xpath = "//input[@placeholder=\"Enter option c\"]") private WebElement option3;
	@FindBy(xpath = "//input[@placeholder=\"Enter option d\"]") private WebElement option4;
	
	@FindBy(xpath = "//select[@placeholder=\"Choose correct answer \"]")private WebElement selectAnswer;
	@FindBy(xpath = "//option[text()='option b']") private WebElement rightOption;
	@FindBy(xpath = "//input[@type=\"submit\"]") private WebElement sbtBtn;
	
	
	
	@FindBy(xpath = "//a[text()='Remove Quiz']") private WebElement removeQuiz;
	@FindBy(xpath = "//tr[2]/td[6]/b/a/span[2]") private WebElement removeElement;
	
	
	//business library
	/**
	 * This method is used to mouse over element action
	 * @param webdriverUtility
	 */
	public void ClickOnquiz()
	{
		clickonQuiz.click();
		addQuiz.click();
		
	}
	public void enterDetails(String title, String questions, String rightmark,String wrongmark,String time,String description) {
		enterQuizTitle.sendKeys(title);
		enterQuestions.sendKeys(questions);
		enterRightmark.sendKeys(rightmark);
		enterWrongmark.sendKeys(wrongmark);
		enterTimeLimit.sendKeys(time);
		enterDescription.sendKeys(description);
		submitBtn.click();
	}
	
	public void enterQuestionDetails(WebdriverUtility webdriverUtility, String question, String a, String b, String c, String d, String answer)
	{
		writeQuestion.sendKeys(question);
		option1.sendKeys(a);
		option2.sendKeys(b);
		option3.sendKeys(c);
		option4.sendKeys(d);
		webdriverUtility.handleSelectDropdown(selectAnswer, answer);
		rightOption.click();
		sbtBtn.click();
		
	}
	
	public void removequiz() {
		clickonQuiz.click();
		removeQuiz.click();
		removeElement.click();
	}
	
	


}
