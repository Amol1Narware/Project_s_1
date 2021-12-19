package POM_CLASSES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitehome {
	//1. Declaration
		@FindBy(xpath = "//span[@class='user-id']") private WebElement userId;
		@FindBy(xpath = "//a[@target='_self']") private WebElement LogoutButton;
		
	//2.initialization
			
		public kitehome(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

	//3. usage
		public String validateid() {
			String actualID = userId.getText();
			return actualID;
		}
		public void clickonUid() {
				userId.click();
		}
		public void clickonLogoutbutton() {
		        LogoutButton.click();		
		}

}
