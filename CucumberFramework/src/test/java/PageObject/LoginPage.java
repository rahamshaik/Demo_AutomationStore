package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rDriver)
	{
		ldriver=rDriver;

		PageFactory.initElements(rDriver, this);
	}
	
	
	@FindBy(id = "loginFrm_loginname")
	WebElement email;
	
	@FindBy(id="loginFrm_password")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"loginFrm\"]/fieldset/button")
	WebElement LoginBtn;
	
	@FindBy(xpath = "//*[@id=\"main_menu_top\"]/li[2]/a/span")
	WebElement logout_menu;
	
	@FindBy(xpath = "//*[@id=\"main_menu_top\"]/li[2]/ul/li[2]/a/span")
	WebElement logout;
	
	public void enterEmail(String emailAdd)
	{
		email.clear();
		email.sendKeys(emailAdd);
	}
	
	public void enterPassword(String pwd)
	{
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton()
	{
		
		LoginBtn.click();
	}
	
	public void clickOnLogOutButton()
	{
		logout_menu.click();
		logout.click();
	}
}