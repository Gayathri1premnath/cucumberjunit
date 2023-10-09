package cucumberjunit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInwebelement extends BaseClass{
	
	 @FindBy(xpath = "//*[@id=\"username\"]")
	 public WebElement username ;
	 
	 @FindBy(xpath = "//*[@id=\"password\"]")
	 public WebElement password ;
	 
	 @FindBy(xpath = "//*[@id=\"submit\"]")
	 public WebElement submit ;	 
	 
	 @FindBy(xpath ="//*[@id=\"loop-container\"]/div/article/div[1]/h1")
	 public WebElement check;
	
	 
	 // PageFactory Class Init Elements method 
	 
	 public LogInwebelement ()
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void validcredentails()
	 {
		 username.sendKeys("student");
		 password.sendKeys("Password123");
		 submit.click();	

}
	 public void checking()
	 {
		 String x=check.getText();
		 if(x.equals("Logged In Successfully"))
		 {
			 System.out.println("Test is passed");
			
		 }
		 else
		 {
			 System.out.println("Test is failed");

		 }
	 }
}
