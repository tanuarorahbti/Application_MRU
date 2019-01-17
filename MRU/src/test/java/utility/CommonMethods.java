package utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class CommonMethods {
	
	  static ArrayList<String> browser = new ArrayList<String>();
	  static ArrayList<String> loginUser = new ArrayList<String>(); 
	  static ArrayList<String> password = new ArrayList<String>();
	  public static String appUser;
	  public static String appPassword;
	  
	
	public static void readExcelData(TestData data) throws FileNotFoundException, IOException {
		ExcelReader exc = new ExcelReader();
		
		  
		  
		  for(int rows =1 ; rows<=ExcelReader.Rowcount(); rows++) {
		  browser.add(ExcelReader.ReadCell(ExcelReader.getCell("Browser"), rows));
		  loginUser.add(ExcelReader.ReadCell(ExcelReader.getCell("Username"), rows));
		  password.add(ExcelReader.ReadCell(ExcelReader.getCell("Password"), rows));
		  
		  }
		  data.setBrowser(browser);
		  data.setLoginUser(loginUser); 
		  data.setPassword(password);
		
	}
	
	public static void testInputs(String input) throws FileNotFoundException, IOException {
		TestData tsd = new TestData();
		readExcelData(tsd);
		
		for(int i=0; i< browser.size(); i++) {
			if (browser.get(i) != null  && input == "Chrome" ) {
				String specificBrowser = browser.get(i);
				appUser = tsd.getLoginUser().get(i);
				appPassword = tsd.getPassword().get(i);
			}
			if (browser.get(i) != null  && input == "Internet Explorer" ) {
				String specificBrowser = browser.get(i);
				appUser = tsd.getLoginUser().get(i);
				appPassword = tsd.getPassword().get(i);
			}
			if (browser.get(i) != null  && input == "Mozila Firefox" ) {
				String specificBrowser = browser.get(i);
				appUser = tsd.getLoginUser().get(i);
				appPassword = tsd.getPassword().get(i);
			}

		}
		
		
	}

}
