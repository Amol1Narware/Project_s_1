package POM_CLASSES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitepin {
	//1. Declaration
		@FindBy(id="pin") private WebElement Pin;
		@FindBy(xpath = "//button[@type='submit']") private WebElement ContinueButton;
		
		//2.Initialization
		public kitepin(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//3.usage
		public void enterpin(String PIN) {
			Pin.sendKeys(PIN);
			}
		public void clickonContinueButton() {
			ContinueButton.click();
			}

}
