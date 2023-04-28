package file_handling_data_driven;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelData {

	public static FileInputStream ip;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;

	@DataProvider(name = "Rediff")
	public static Object[][] getRediffExcelData() throws Exception {
		Object[][] data = ExcelData.readDataFromExcelforRediff("LoginRediff");
		return data;
	}

	@DataProvider(name = "TN")
	public static Object[][] getTNExcelData() throws Exception {
		Object[][] data = ExcelData.readDataFromExcelforTutorialsNinja("LoginTN");
		return data;
	}

	public static Object[][] readDataFromExcelforRediff(String sheetName) throws Exception {
		// Step1: Create the Object of FileInputStream Class and pass the path of Excel
		// sheet in the constructor
		ip = new FileInputStream("C:\\Users\\autom\\eclipse-workspace\\CANADA_BATCH_MARCH_2023\\src\\test\\java\\file_handling_data_driven\\ExcelDataCode.xlsx");

		// .xls - we used to create the object of a class known as HSSFWorkbook
		// .xlsx - it is new version. So we create the Object of XSSFWorkbook

		// Step 2: Create the object of XSSFWorkbook class and pass the ip reference in
		// its constructor
		workbook = new XSSFWorkbook(ip);

		// Step 3: use the workbook reference to get the sheet and return the value of
		// XSSFSheet class
		sheet = workbook.getSheet(sheetName);

		// Step 4: determine rows and cols
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();

		// Step 5: Create a 2-Dimensional Object Array
		Object[][] data = new Object[rows][cols];

		// Step 6: Nested for loop to iterate between rows and cols
		for (int i = 0; i < rows; i++) {
			XSSFRow row = sheet.getRow(i + 1);

			for (int j = 0; j < cols; j++) {
				XSSFCell cell = row.getCell(j);

				// Step 7: You have to determine what is the data type in each cell or column
				CellType cellType = cell.getCellType();

				switch (cellType) {

				case STRING:
					data[i][j] = cell.getStringCellValue();
					break;
				case NUMERIC:
					data[i][j] = Integer.toString((int) cell.getNumericCellValue());
					break;
				case BOOLEAN:
					data[i][j] = cell.getBooleanCellValue();
					break;
				}

			}

		}

		return data;
	}

	public static Object[][] readDataFromExcelforTutorialsNinja(String sheetName) throws Exception {
		ip = new FileInputStream("C:\\Users\\autom\\eclipse-workspace\\CANADA_BATCH_MARCH_2023\\src\\test\\java\\file_handling_data_driven\\ExcelDataCode.xlsx");
		workbook = new XSSFWorkbook(ip);
		sheet = workbook.getSheet(sheetName);

		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rows][cols];

		for (int i = 0; i < rows; i++) {
			XSSFRow row = sheet.getRow(i + 1);

			for (int j = 0; j < cols; j++) {
				XSSFCell cell = row.getCell(j);
				CellType cellType = cell.getCellType();

				switch (cellType) {

				case STRING:
					data[i][j] = cell.getStringCellValue();
					break;
				case NUMERIC:
					data[i][j] = Integer.toString((int) cell.getNumericCellValue());
					break;
				case BOOLEAN:
					data[i][j] = cell.getBooleanCellValue();
					break;

				}

			}

		}

		return data;

	}
}
