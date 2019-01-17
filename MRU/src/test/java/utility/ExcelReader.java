package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static XSSFWorkbook wb;
	public static XSSFSheet wrksheet;
	public static Hashtable<String, Integer> dict = new Hashtable<String, Integer>();
	
	public ExcelReader() throws FileNotFoundException, IOException {
		wb =  new XSSFWorkbook(new FileInputStream ("C:\\Users\\tanu.a.arora\\eclipse-workspace\\MRU\\TestData1.xlsx"));
		wrksheet = wb.getSheet("Sheet1");
		
	}
	
	public static  String ReadCell(int col, int rownum) {
		return wrksheet.getRow(rownum).getCell(col).getStringCellValue();
		
	}
	public static void columnDictionary() {
		for(int i =0; i< wrksheet.getRow(0).getLastCellNum(); i++) {
			dict.put(ReadCell(i,0), i);
		}
		
		}
	public static int getCell(String colname) {
		int value = dict.get(colname);
		return value;
//		}catch(NullPointerException e) {
//			return 0;
		
	}
	public static int Rowcount() throws FileNotFoundException, IOException {
		
		//System.out.println(wrksheet.getRow(1).getCell(0).getStringCellValue());
		//System.out.println(wrksheet.getLastRowNum());
		return wrksheet.getLastRowNum();
	}
	}
	


