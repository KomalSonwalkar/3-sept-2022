package Pagess;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadExcelFile;

public class OrderPage extends TestBase {
	
	//object Repository
		@FindBy(xpath="(//a[@class='orders-nav-item'])")private WebElement orderLink;
		@FindBy(xpath="//button[@class='button-blue']")private WebElement getStartedBtn;
		@FindBy(xpath="(//input[@icon='search'])[2]")private WebElement searchBox;
		@FindBy(xpath="(//button[@class='button-outline button-blue'])[1]")private WebElement createGTTBtn;
        @FindBy(xpath="(//input[@type='number'])[1]")private WebElement triggerPrice ;
        @FindBy(xpath="(//input[@type='number'])[3]")private WebElement quantity;
        @FindBy(xpath="(//input[@type='number'])[4]")private WebElement price;
        @FindBy(xpath="(//button[@class='place button-blue'])")private WebElement placeBtn;
        
        
        public OrderPage()
        {
        	PageFactory.initElements(driver, this);
        }

        public void verifyOrederLink() throws Exception
        {
        	orderLink.click();
        	Thread.sleep(2000);
        	getStartedBtn.click();
        	
        }
        public void verifyOrderPlace() throws Exception
        {
        	
        	searchBox.sendKeys(ReadExcelFile.readExcelFile(1, 0));
        	Actions a = new Actions(driver);
        	a.moveToElement(searchBox).build().perform();
        	for(int i=0;i<5;i++)
        	{
        		a.sendKeys(Keys.DOWN).build().perform();
        	}
        	a.sendKeys(Keys.ENTER).build().perform();
        	Thread.sleep(2000);
        	createGTTBtn.click();
        	Thread.sleep(2000);
        	triggerPrice.clear();
        	triggerPrice.sendKeys(ReadExcelFile.readExcelFile(1, 1));
        	quantity.clear();
        	quantity.sendKeys(ReadExcelFile.readExcelFile(1, 2));
        	price.clear();
        	price.sendKeys(ReadExcelFile.readExcelFile(1, 3));
        	Thread.sleep(2000);
        	placeBtn.click();
        	
        	
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
}
