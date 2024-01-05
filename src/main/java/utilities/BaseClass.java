package utilities;
import java.time.Duration:
public class BaseClass {
	public static WebDriver driverı

	Order Conform...

	Payment Metho...

	Tshirt

	public Datattility data new DataUtility(),

	public Weber vertcity wu-new WebDriverUtility();

	public Dropdowntility drpu-new DropDownUtility();

	@BeforeClass

	public void ringer() throws Throwable (

	System.out.println("launchingBrowser);

	String BROWSER-data.dataFromPropertiesfile("Browser");

	if (BROWSER.equals("Chrome")) {

	driver = new ChromeDriver();

	} else if (BROWSER.equals("fizafox")) {

	driver new FirefoxDriver ();

	} else if (BROWSER.equals("edge")) {

	driver = new EdgeDriver ():

	} else {

	driver = new ChromeDriver();

	String URL data.datafromPropertiesFile("URL");

	driver.get(URL);

	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait (Duration.ofSeconds (25));

	@BeforeMethod

	public void loginToApplication() throws Throwable (

	System.out.println("loginToApplication)

	Thread.sleep(3000);

	Welcome Page Wipage

	new Welcome Page (driver)
	Welcome Sage Wipage = new Welcome Page (driver); Thresa, sleep(2000); WLpage.getMainLoginButton().click();

	LoginPage Lpage new LoginPage (driver);

	String emailld data.dataFromPropertiesFile("UN"); Lpage.getEnailfextField().sendKeys (emailId);

	Lpage.getLoginButton().click();
	@AfterMethod
	public void logoutFromApplication() throws Throwable { System.out.println("-

			Thread.sleep(6000); logou-FzonApplication");

			Home Page Hpage new HomePage (driver), Hpage.javaScriptClick(driver)

			Account SettingPage Aspage naw AccountSettingPage(driver): Aspage.getLogoutIcon().click();

			)

			@hiterClass

			public void quilBrowser () ( System.out.println(" driver.quit(); -quitBrowser"),

}
