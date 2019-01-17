package test;

import java.util.ArrayList;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello Tanu";
		String[] arr = s1.split(" ");
		String s2 ="";
		String s3 = "";		
		for (int i = arr.length; i>0; i--) {
			System.out.println(i);
			
			 s1 = arr[i-1];
			 System.out.println(s1);
			
			for(int j = s1.length(); j>0; j-- ) {
				System.out.println(j);
				System.out.println(s1.charAt(j-1));
				s2 = s2 + s1.charAt(j-1);
				
			}
			s3 = s3 +s2;
			s2 =" ";
		}
		System.out.println(s3);
		
		

	}
	
	
}			
			
			
		
		
	


