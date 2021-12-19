package POM_CLASSES;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLogin {
	//1.declaration
		@FindBy(id="userid") private WebElement UserId;
		@FindBy(xpath = "//span[text()='User ID should be minimum 6 characters.']") private WebElement UidErrormsg;
		@FindBy(id="password") private WebElement Password;
		@FindBy(xpath = "//span[text()='Password should be minimum 6 characters.']") private WebElement PWDErrormsg;
		@FindBy(xpath = "//p[@class='error text-center']") private WebElement Errormsg;
		@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;
		
		//2.Initialization
		
		public kiteLogin(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		//3.usage
		
		public void enterid(String userid) {
			UserId.sendKeys(userid);
		}
		public void enterpassword(String PWD) {
			Password.sendKeys(PWD);
		
		}
		public String validateErrorMsg() {
			String actualmsg = Errormsg.getText();
			return actualmsg;
			}
		public String ValidateUseridErrormsg() {
			String Actual = UidErrormsg.getText();
			return Actual;
			}
		public String ValidatePWDErrormsg() {
			String Actual = PWDErrormsg.getText();
			return Actual;
			}
		public void clickonLoginbutton() {
			LoginButton.click();
		}

}
