package utility;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {
	CommonMethods cmd = new CommonMethods();
	
	private ArrayList<String> Browser ;
	private ArrayList<String> LoginUser ;
	private ArrayList<String> password ;
	
	public ArrayList<String> getLoginUser(){
		return LoginUser;
	}
	public ArrayList<String> setLoginUser(ArrayList<String> LoginUser){
		return this.LoginUser = LoginUser;
	}
	
	public ArrayList<String> getBrowser(){
		return Browser;
	}
	public ArrayList<String> setBrowser(ArrayList<String> browser){
		return this.Browser = browser;
	}
	
	public ArrayList<String> getPassword(){
		return password;
	}
	public ArrayList<String> setPassword(ArrayList<String> password){
		return this.password =password;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String getCell(int rownum, int col) throws IOException {
		FileInputStream fis = new FileInputStream("");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("");
		XSSFRow row = sh.getRow(rownum);
		XSSFCell cell = row.getCell(col);
		return cell.getStringCellValue();
		
	}

	
	
}
