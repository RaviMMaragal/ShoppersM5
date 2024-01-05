package pomclasses;
import org.openqa.selenium.WebDriver
public class LoginPage {
	public WebDriver driver

	public LoginPage (WebDriver driver) ( PageFactory.initElements(driver, this)

	@FindBy(id "Email")

	private WebElement emailTextField,
	public WebElement getEmailTextField() {

		return emailTextField

		@FindBy(id "Password")

		private WebElement PasswordTextFields

		public WebElement getPasswordTextField()(

		return PasswordTextField,

		@FindBy(id "Login")

		private WebElement LoginButton/

		public WebElement getLoginButton
		@FindBy(id="Phone Number")

		400

		private WebElement phone NumberTextField/

		@FindBy(xpath="//button[text()='Add Address']")

		private WebElement addAddressButton/

		public WebElement getNameTextField() {

		return nameTextField/

		public WebElement getHouseOfficeInformationTextField() {

		return houseOfficeInformationTextField/

		public WebElement getStreetInformationTextField() { return streetInformationTextField,

				public WebElement getLandMarkTextField() {

			return landMarkTextField,

			public WebElement getCountryDropDown () {

			return countryDropDown/

			public WebElement getStateDropDown () {

			return stateDropDown/

			public WebElement getCityDropDown () (

			return cityDropDown/

			public WebElement getPincodeTextField() (

			return pincodeTextField/
}
