package TEST_CLASSES;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BASE.Base;
import POM_CLASSES.kiteLogin;
import POM_CLASSES.kitehome;
import POM_CLASSES.kitepin;
import UTLITY.utlity;




public class TestKite1 extends Base {
	kiteLogin login;
	kitepin pin;
	kitehome home;
	 @BeforeClass
	  public void launchBrowser() throws InterruptedException
	  {
		  Reporter.log("initializing browser",true);
		  LaunchingBrowser();
		  Thread.sleep(1000);
		  login= new kiteLogin(driver);
		  pin= new kitepin(driver);
		  home= new kitehome(driver);
		}
	 @BeforeMethod
	 public void logintokite() throws EncryptedDocumentException, IOException, InterruptedException {
		 Thread.sleep(4000);
		 Reporter.log("Entering userid and Password ",true);
		 login.enterid(utlity.getDataFromExcel(0, 0));
		 Thread.sleep(4000);
		 login.enterpassword(utlity.getDataFromExcel(0, 1));
		 Thread.sleep(4000);
		 login.clickonLoginbutton();
		 Thread.sleep(4000);
		 Reporter.log("entering pin",true);
		 pin.enterpin(utlity.getDataFromExcel(0, 2));
		 pin.clickonContinueButton();
		 
	 }
	 @Test
	 public void validateuID() throws EncryptedDocumentException, IOException, InterruptedException {
		 int TCID=1002;
		 Thread.sleep(2000);
		 String actualid = home.validateid();
		 Thread.sleep(2000);
		 String expectedid=utlity.getDataFromExcel(0, 0);
		 Reporter.log("Validating Uid",true);
		 Assert.assertEquals(actualid, expectedid,"IDs not matching TC Failed");
		 Reporter.log("IDs are matching TC is Passed", true);
		 Reporter.log("Taking screenshot",true);
		 Thread.sleep(2000);
		 utlity.getScrreenshot(driver, TCID);
    }
	 @AfterMethod
	 public void logouttokite() throws InterruptedException {
		 Thread.sleep(4000);
		 Reporter.log("logiing out...",true);
		 home.clickonUid();
		 Thread.sleep(4000);
		 home.clickonLogoutbutton();
		 
	 }
	 @AfterClass
	 public void closingBrowser() {
		 Reporter.log("Closing Browser",true);
		 driver.close();
	 }
}
