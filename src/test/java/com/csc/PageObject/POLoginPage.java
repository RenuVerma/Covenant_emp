package com.csc.PageObject;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class POLoginPage extends BaseUI{

		public POLoginPage(WebDriver driver) {
			super(driver);}
		
		@FindBy(id="userName")
		private WebElement txtBox_userName;
		
		@FindBy(id="password")
		private WebElement txtBox_password;

		@FindBy(xpath="/html/body/div[2]/form/div/div/div/div/form/button")
		private WebElement signInButton;
		
		@FindBy(xpath="/html/body/div[2]/form/div[1]/div[1]/div[2]/div[6]/div/span")
		private WebElement Event_Type;
		
		public POLHomePage logIn(String userName, String password){
			wait.explicitWaitForElement(txtBox_userName);
			txtBox_userName.sendKeys(userName);
			txtBox_password.sendKeys(password);
			signInButton.click();
//			System.out.println("Enter");
//			wait.explicitWaitForElement(Event_Type);
//			Event_Type.click();
			return new POLHomePage();
			
		}

}
