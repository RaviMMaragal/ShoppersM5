package utilities;

import java.util.ArrayList

9 public class DropDownUtility (

public void selectDropDownByVisibleText(String textOfOption,WebElement selectTagOfDropDown) ( Select select-new Select (selectTagOfDropDown) select.selectByVisibleText(textOfOption),

		public void selectDropDownByValueattributeValue(String ValueattributeValue, NebElement selectTagOfDropDown) (

				Select select new Select (selectTagOfDropDown), select.selectByValue (ValueattributeValue);

				public void selectDropDownByIndex(int index, WebElement selectTagOfDropDown) ( Select select new Select(selectTagOfDropDown), select.selectByIndex(index);

				public void deselect DropDownByVisibleText(String textOfOption, WebElement selectTagOfDropDown) ( Select select new Select (selectTagOfDropDown), lect.deselectByVisibleText(textOfOption)/

				public void deselectDropDownByValueattributeValue(String ValueattributeValue, WebElement selectTagOfDropDown) (

				Select select-new Select (selectTagOfDropDown); select.deselectByValue (ValueattributeValue),

				public void deselectDropDownByIndex(int index, WebElement selectTagOfDropDown) ( Select select-new Select (selectTagOfDropDown);

				select.deselectByIndex(index),

				public ArrayList<String> ToGetAllOptionsText (WebElement selectTagOfDropDown) ( Select select now Select (selectTagOfDropDown);
				select.selectByIndex(index);

				public void deselectDropDownByVisibleText(String textOfOption, WebElement selectTagOfDropDown) (

				Select select=new Select(selectTagOfDropDown); select.deselectByVisibleText(textOfOption);

				public void deselectDropDownByValueattributeValue(String ValueattributeValue, WebElement selectTagOfDropDown

				Select select new Select (selectTagOfDropDown)/

				ct.deselectByValue (ValueattributeValue);

				public void deselectDropDownByIndex(int index, WebElement selectTagOfDropDown) {

				Select select-new Select (selectTagOfDropDown):

				select.deselectByIndex(index);

				public ArrayList<String> ToGe-Al Options Text (WebElement selectTagOfDropDown) (

				Select select =new Select (selectTagOfDropDown);

				List<WebElement> alloptions select.getOptions();

				ArrayList<String> alloptionsTexts new Azrayist<String>();

				for (WebElement ele:allOptions) { allOptionsTexts.add(ele.getText());
				return alloptionsTexts,

						public WebElement ToGe-Perticu.azOptiononIndex (WebElement selectTagOfDropDown, int indexOfOption)(

						Select select new Select (selectTagOfDropDown): List<WebElement> alloptions-select.getOptions(),

						WebElement perticularOptiononWebElement-alloptions.get(indexOfOption)/

						return perticularOptiononWebElement;
}
