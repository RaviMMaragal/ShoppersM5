package utilities;
import org.openqa.selenium.JavascriptExecutor

public class WebDriverUtility {
	JavaUtilityListenersUt

	WebDriver Utx

	Author: sai kumar / When we get Element click intercepted exception (when element is hidden by other element) then we will use java script click it will take webDriver object and element ref on which you want to perform

	javascript click

	public void javaScriptClick (WebDriver driver, WebElement ele) ( JavascriptExecutor jae

	(JavascriptExecutor) driver: jae.executeScript ("arguments[0].click();", ele):
		@param driver


		@param ele

		Author: sai kumar to avoid ElementClickInterceptedException

		@param driver

		@param ele

		@param data

		public void javascript SendKeys (WebDriver driver, WebElement ele, String data) ( JavascriptExecutor jse (JavascriptExecutor) driver/ jae.executeScript("arguments[0].Value arguments[1]", ele, data)

		Author: sai kumar this method will scroll the webpage till the given element
		public void mouseOverAction (WebDriver driver, WebElement ele) ( Actions action = new Actions (driver); action.moveToElement (ele).perform();

		to perform right operation on webelement

		@param driver

		@param ele

		public void rightClick(WebDriver driver, WebElement ele) {

		Actions action - new Act Actions (driver); action.contextClick(ele).perform();
		
		to perform double operation on webelemeIt

		@param driver

		@param ele

		public void doubleClick (WebDriver driver, WebElement ele) {

		Actions action new Actions (driver) action.doubleclick(ele).perform()/

		To perform dragAndDrop operation between two elements

		@param
		public void javaScriptScrollTillWebElement (WebDriver driver, WebElement ele) ( JavascriptExecutor jse (JavascriptExecutor) driver/ jse.executeScript("arguments[0].scrollIntoView(true)", ele);

		Author: sai kumar this method will scroll the webpage with given coordinates

		@param driver

		@param xCoordinate

		@param yCoordinate

		public void javaScriptScrollByCoordinates (WebDriver driver, int xCoordinate, int yCoordinate) ( JavascriptExecutor jse (JavascriptExecutor) driver;

		jse.executeScript("scrollBy(" + xCoordinate +
				@param driver

				@paran

				"," + yCoordinate + ");");

				Author: sai kumar this method will highlight the webElement border with 2px T

				solid red color

				@param driver

				@param ele

				public void javascriptHighLightWebElement (WebDriver driver, WebElement ele) { JavascriptExecutor jse (JavascriptExecutor) driver/ jse.executeScript("arguments[0].style.border='2px solid red's", ele):

				Author: sai kumar to perform mouse overactions on webelement
				@param driver

				@param ele

				DataUtility.....

				DropDownUti...ipathConsta...

				JavaUtility....

				ListenersUt....

				WebDriverUt

				public void explicitlyWaitForElementToBeClickable (WebDriver driver, By locator, int timeDelay) ( WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(timeDelay)); wait.until(ExpectedConditions.elementToBeClickable (locator));		
				@param driver

				@param ele

				@param timeDelay

				public void explicitly WaitForElementToBeVisible (WebDriver driver, WebElement ele, int timeDelay) { WebDriverWait wait - new WebDriverWait(driver, Duration.ofSeconds (timeDelay)):

				wait.until(ExpectedConditions.visibilityOf(ele));

				I

				this method will wait until alert is present

				@param driver
				@param matalay

				public void explicitlyWaitForAlert (WebDriver driver, int timeDelay) ( WebDriverWait wait - new WebDriverWait(driver, Duration.ofSeconds (timeDelay)) wait.until(ExpectedConditions.alert IsPresent());
				@param matalay

				182

				183

				184-

				185

				186

				107

				189->

				190

				public void explicitlyWaitForAlert (WebDriver driver, int timeDelay) ( WebDriverWait wait - new WebDriverWait(driver, Duration.ofSeconds (timeDelay)) wait.until(ExpectedConditions.alert IsPresent());
				}
