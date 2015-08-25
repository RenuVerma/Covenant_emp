package CoHealthNew.CoHealth;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;

	import com.csc.PageObject.POLoginPage;
	import com.csc.PageObject.POLHomePage;

	public class Intializer {

		private WebDriver driver;
		private DriverFactory drFactory;
		public POLoginPage loginPage;
		public POLHomePage homePage;
		
		public Intializer(String browser){
			
		    
			drFactory = new DriverFactory();
			_startBrowser(browser);
			_initPageObject();
		}
		
		private void _startBrowser(String browser){
			driver = drFactory.getDriver(browser);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		
		private void _initPageObject(){
			loginPage = new POLoginPage(driver);
			homePage = new POLHomePage(driver);		}
		

}
