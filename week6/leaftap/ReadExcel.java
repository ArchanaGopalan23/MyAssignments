package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {


	public static String[][] inputData(String filename) throws IOException {
//Open the file
		//set the path for workbook
		XSSFWorkbook wb = new XSSFWorkbook("data/"+filename+".xlsx");
		//Get the Sheet 
		//XSSFSheet sheet = wb.getSheet("Sheet1");//using sheet name
		XSSFSheet ws = wb.getSheetAt(0);//using sheet index
		//Get the row 
		//XSSFRow row = ws.getRow(0);
		//Get the column using cell
		//XSSFCell cell = row.getCell(0);
		//to print the value in that cell
		//String stringCellValue = cell.getStringCellValue();
		//System.out.println(stringCellValue);
		
		/*for(int i=0;i<=2;i++) {
			XSSFRow row = ws.getRow(i);
			XSSFCell cell = row.getCell(0);
			//to print the value in that cell
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);

		}*/
		//to get rowCount
		 int rowCount = ws.getLastRowNum();
		 short colCount = ws.getRow(0).getLastCellNum();
		 String[][] data = new String[rowCount][colCount];
		for(int i=1;i<=rowCount;i++) {
			XSSFRow row = ws.getRow(i);
			//to get column count
			for(int j=0;j<colCount;j++) {
			XSSFCell cell = row.getCell(j);
			//to print the value in that cell
			data[i-1][j]=cell.getStringCellValue();
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			}
		}
		//close the file
		wb.close();

		return data;
	}

}
