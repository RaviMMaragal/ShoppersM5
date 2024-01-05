package utilities;

import java.io.File:


OrderConform..

Payment Metho...

TshirtPage.java

WelcomePage...

BaseClass.javaDataUtility

13 public class DataUtility<Obeject> {

	public String dataFrom PropertiesFile (String key) throws Throwable (

			File file new File(IpathConstant.propertiespath):

			FileInputStream fis new FileInputStream(file),

			Properties pro new Properties();

			pro.load(fis):

			String value = pro.getProperty(

			return value;

			public String dataFromExcelFile(String SheetName, it RowNum, int colNum) throws Throwable {

			File file new File(IpathConstant.Excelpath); FileInputStream fis new FileInputStream(file),
			} 
			public Chject[][] accessA112dess() throws Throwable {
				Workbook workbook Workbookfactory.create(fis):

					Sheet sheet workbook.getSheet (SheetName);

					Row row sheet.getRow (RowNum);

					DataFormatter formatter = new DataFormatter();

					String value formatter.formatCellValue(row.getCell (colNum));

					return value;

					Object[][] ref=new Object[1][9];

					System.out.println("second test case")/ File file new file (IpathConstant. Excelpath) FileInputStream fis-new FileInputStream(file), Workbook workbook-WorkbookFactory.create(fis); Sheet sheet-workbook.getSheet("Sheet1"), DataFormatter form-new DataFormatter(),

					int count=0;
					public String dataFromExcelFile(String File file new File(IpathConstant.Excelpath);

					SheetName,

					int RowNum, int colNum) throws Throwable l

					FileInputStream fis new FileInputStream(file), Workbook workbook WorkbookFactory.create(fis);

					Sheet sheet workbook.getSheet (SheetName),

					sheet.getRow(RowNum), Row row

					DataFormatter formatter = new DataFormatter(),

					String value formatter.formatCellValue(row.getCell(colNum)),
					return value,

							public Object[][] accessAllAddress() throws Throwable

							Object[][] ref=new Object [1] [9]

							System.out.println("second test case"),

							File file new File(IpathConstant.Excelpath),

							FileInputStream fis-new FileInputStream(file), Workbook workbook-WorkbookFactory.create(fis);

							Sheet sheet workbook.getSheet("Sheet1");

							DataFormatter form-new DataFormatter();

							int count=0;

							for(int i=1;i<-sheet.getFirstRowNum();i++) {

							for(int j=0zj<sheet.getRow(i).getLastCellNum();j++) {

							ref[count][j]-form.formatCellValue(sheet.getRow(i).getCell(j)).toString()

							count++;

							return ref,
			}
