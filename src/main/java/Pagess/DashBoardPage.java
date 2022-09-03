package Pagess;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashBoardPage extends TestBase {
	//object reposetory
	@FindBy(xpath="//span[text()='Dashboard']")private WebElement dashBoardLink;
	@FindBy(xpath="//h1[@class='page-title big']")private WebElement nickName;
	@FindBy (xpath="//span[@class='user-id']")private WebElement userId;
	@FindBy(xpath="//h4[@class='username']")private WebElement userName;
	@FindBy (xpath="//div[@class='email']")private WebElement userEmail;
	@FindBy(xpath="(//a[@class='router-link-exact-active router-link-active'])[2]")private WebElement myProfile;
	@FindBy(xpath="//div[@class='avatar']")private WebElement avtarIcon;
	@FindBy(xpath="//a[@target='_self']")private WebElement logOutLink;

	
	public DashBoardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifydashBoaedLink() throws Exception
	{
		Thread.sleep(2000);
		return dashBoardLink.getText();
	}
    public String verifynickName()
    {
    	return nickName.getText();
    }
    public void verifyuserId() throws Exception
    {
    	Thread.sleep(2000);
    	avtarIcon.click();
    	Thread.sleep(1000);
    	userName.click();
    	Thread.sleep(1000);
    	avtarIcon.click();
    	Thread.sleep(1000);
    	userEmail.click();
        avtarIcon.click();
    	Thread.sleep(1000);
    	myProfile.click();
    	Thread.sleep(1000);
    	avtarIcon.click();
    }
    public void verifylogOutLink() 
    {
    	
    	avtarIcon.click();
         logOutLink.click();
    }
	
	
}
