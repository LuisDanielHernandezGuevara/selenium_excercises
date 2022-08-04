package Introduction.excercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.logging.log4j.*;

public class ExcelCreator {
	public static Logger Log = LogManager.getLogger(ExcelCreator.class.getName());

	public static void main(String[] args)  {

		try {
			
			
		FileInputStream input = new FileInputStream("C://Users//1000075142//Documents//Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		int number = workbook.getNumberOfSheets();
		
		for(int i = 0 ;i < number; i++) {
			System.out.println(workbook.getSheetName(i));
			Log.debug("SheetName got");
			Log.info("Information log");
			
			if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
				//Identify test cases column by scanning the entire 1st row
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				//Sheet is colection of row
				Iterator<Row> rows = sheet.iterator();
				
				//Row is a collection of cells
				Row firstRow = rows.next();
				Iterator<Cell> ce = firstRow.cellIterator();
				/*
				while(ce.hasNext()) {
					Cell value = ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("Row1")){
						
					}
				}
				*/
				int k=0;
				int column=0;
				
				while(ce.hasNext()) {
					Cell value = ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("Row1")) {
						column=k;
					}
					k++;
				}
				
				while(ce.hasNext()) {
					Row r = rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Test2")) {
					
						//After you grab purchase testcase row = pull all the data
						//of that row
						
						Iterator<Cell> cv = r.cellIterator();
						while(cv.hasNext()) {
							System.out.println(cv.next().getStringCellValue());
						}
					}
				}
			}
			Log.debug("SheetName got");

		}
		
	}catch(Exception ex) {
		ex.printStackTrace();
	}
	}
}
