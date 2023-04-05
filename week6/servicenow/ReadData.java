package assignment.week5;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static String[][] inputdata(String excelSheet) throws IOException {
		// TODO Auto-generated method stub
		
		//TO open Xlsx
		XSSFWorkbook wbook = new XSSFWorkbook("data/ServiceNow.xlsx");
		//To get the sheet
		XSSFSheet sheet = wbook.getSheet(excelSheet);
		//To get the row count
		int rowCount = sheet.getLastRowNum();
		//To get column
		short colCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][colCount];
		
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<colCount;j++) {
				XSSFCell cell = row.getCell(j);
				data[i-1][j]= cell.getStringCellValue();
			}
			
		}
		wbook.close();

		return data;

	}

}
