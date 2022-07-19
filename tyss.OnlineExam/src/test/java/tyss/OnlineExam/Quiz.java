package tyss.OnlineExam;

import org.OnlineExam.objectRepository.BaseClass;
import org.tyss.genericUtility.QuizPage;
import org.testng.annotations.Test;

public class Quiz extends BaseClass{

	@Test(groups="regression"6)
	public void quiz() {
		// TODO Auto-generated method stub
		
		
		QuizPage quizPage= new QuizPage(driver);
		
		quizPage.ClickOnquiz();
		
		String sheetname="Quiz";
		String title = excelUtility.getDataFromExcel(sheetname, 1, 1);
		String question = excelUtility.getDataFromExcel(sheetname, 2, 1);
		String rightMark = excelUtility.getDataFromExcel(sheetname, 3, 1);
		String wrongMark = excelUtility.getDataFromExcel(sheetname, 4, 1);
		String timelimit = excelUtility.getDataFromExcel(sheetname, 5, 1);
		String description = excelUtility.getDataFromExcel(sheetname, 6, 1);
		
		quizPage.enterDetails(title, question, rightMark, wrongMark, timelimit, description);
		
		String sheet="Quiz";
		String writeQuestion = excelUtility.getDataFromExcel(sheet, 7, 1);
		String option1 = excelUtility.getDataFromExcel(sheet, 8, 1);
		String option2 = excelUtility.getDataFromExcel(sheet, 9, 1);
		String option3 = excelUtility.getDataFromExcel(sheet, 10, 1);
		String option4 = excelUtility.getDataFromExcel(sheet, 11, 1);
		String rightAnswer = excelUtility.getDataFromExcel(sheet, 12, 1);
		
		
		quizPage.enterQuestionDetails(webdriverUtility, writeQuestion, option1, option2, option3, option4, rightAnswer);
		quizPage.removequiz();
	
		



	}

}
