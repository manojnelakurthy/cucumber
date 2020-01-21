package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commonFunLibrary.FunctionERP;
import cucumber.api.java.en.When;

public class StepDefinition {
 WebDriver driver;
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
	 driver= FunctionERP.startBrowser("chrome") ; 
	}

	@When("^Open Application$")
	public void open_Application() throws Exception {
		FunctionERP.openApplication(driver);
	   	}

	@When("^Wait For Username$")
	public void wait_For_Username() throws Throwable {
	    FunctionERP.waitForElement(driver, "name","username", "5");
	}

	@When("^Enter Username$")
	public void enter_Username() throws Throwable {
	   FunctionERP.typeAction(driver, "name", "username","admin");
	}

	@When("^Wait For password$")
	public void wait_For_password() throws Throwable {
		 FunctionERP.waitForElement(driver, "name","password", "5");
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
		 FunctionERP.typeAction(driver, "name", "password", "master");
	}

	@When("^Wait For Login$")
	public void wait_For_Login() throws Throwable {
		FunctionERP.waitForElement(driver, "id", "btnsubmit", "5");
	}

	@When("^Click On Login$")
	public void click_On_Login() throws Throwable {
		FunctionERP.clickAction(driver, "id", "btnsubmit");
	}

	@When("^Wait For Logout$")
	public void wait_For_Logout() throws Throwable {
		FunctionERP.waitForElement(driver, "id", "logout", "5");
	}

	@When("^Click On Logout$")
	public void click_On_Logout() throws Throwable {
		FunctionERP.clickAction(driver, "id", "logout");
	}

	@When("^Wait For Ok$")
	public void wait_For_Ok() throws Throwable {
		FunctionERP.waitForElement(driver, "xpath", "//button[text()='OK!']", "5");
	}

	@When("^Click On Ok$")
	public void click_On_Ok() throws Throwable {
	   FunctionERP.clickAction(driver, "xpath", "//button[text()='OK!']");
	}

	@When("^Close Browser$")
	public void close_Browser() throws Throwable {
	    FunctionERP.closeBrowser(driver);
	}

	
}
