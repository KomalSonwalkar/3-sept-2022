package Pagess;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadPropertyFile;

public class LoginPage extends TestBase {
	
	//object reprojectory
    @FindBy (xpath="//img[@alt='Kite']")private WebElement kiteLogo;
    @FindBy (xpath="//h2[text()='Login to Kite']") private WebElement Kitelebal;
	   @FindBy (xpath="//input[@id='userid']") private WebElement userIDTextBox;
	   @FindBy (xpath="//input[@id='password']")private WebElement passTextBox;
	   @FindBy (xpath="//button[@class='button-orange wide']") private WebElement loginBtn;
	   @FindBy (xpath = "//input[@type='password']") private WebElement pinTextBox;
	   @FindBy(xpath="//button[text()='Continue ']")private WebElement cuntinueBtn;
	   @FindBy(xpath = "//img[@alt='Zerodha']") private WebElement zerodhaLogo;
	   
	   
	   
	   public LoginPage()
	   {
		   PageFactory.initElements(driver, this);
	   }
	   public boolean verifyKiteLogo()
	   {
		   return kiteLogo.isDisplayed();
	   }
	public String verifyKitelebal() {
		return Kitelebal.getText();
	}
	public boolean verifyzerodhaLogo()
	{
		return zerodhaLogo.isDisplayed();
	}
	public void verifyZerodhaLogin() throws Exception
	{
		userIDTextBox.sendKeys(ReadPropertyFile.readProperty("userid"));
		passTextBox.sendKeys(ReadPropertyFile.readProperty("password"));
		loginBtn.click();
		Thread.sleep(2000);
		pinTextBox.sendKeys(ReadPropertyFile.readProperty("pin"));
		cuntinueBtn.click();
		
	}

}
