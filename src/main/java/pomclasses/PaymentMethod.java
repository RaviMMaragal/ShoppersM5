package pomclasses;

public class PaymentMethod {
	public WebDriver driver;

	public Payment Method (WebDriver driver) {

	PageFactory.initElements(driver,this)

	@FindBy(xpath="//input[@value='COD']")

	private WebElement cashOndeliveryRadioButton/

	@FindBy(xpath="//button [text()='Proceed']")

	private WebElement ProceedButton;

	@FindBy(xpath="//input[@value='Net Banking']")

	private WebElement NetBankingButton;

	public WebElement getNetBankingButton() {

	return NetBankingButton;
	}

	public WebElement getcashondeliveryRadioButton() {

	return cashOndeliveryRadioButton/

	public WebElement getProceedButton() {

	return ProceedButton/
}
