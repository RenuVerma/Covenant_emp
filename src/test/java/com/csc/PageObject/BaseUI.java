package com.csc.PageObject;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;

	import com.csc.util.SeleniumWaitProvider;

	public class BaseUI {
		
		WebDriver driver;
		SeleniumWaitProvider wait;

		public BaseUI(WebDriver driver){
			PageFactory.initElements(driver, this);
			this.driver = driver;
			wait = new SeleniumWaitProvider(driver);
		}
		
		public BaseUI(){
					}
		public void launchApplication(String url){
			System.out.println("Launching the URL :- "+url);
			driver.get(url);
		}
		
		public void closeBrowser(){
			driver.quit();
		}
		

}
