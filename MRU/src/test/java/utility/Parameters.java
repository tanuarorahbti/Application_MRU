package utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Parameters {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		CommonMethods commonMethodobj = new CommonMethods();
		TestData td = new TestData();
		ExcelReader exc = new ExcelReader();
		exc.columnDictionary();
		commonMethodobj.readExcelData(td);
		//commonMethodobj.testInputs();
		
		/*
		 * String User = td.getLoginUser().get(0); String password1 =
		 * td.getPassword().get(0); System.out.println(User);
		 * System.out.println(password1);
		 */

	}

}
