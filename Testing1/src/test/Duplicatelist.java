package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Duplicatelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> at = new ArrayList<String>();
		
		for (int i =0 ; i<10; i++) {
			at.add(String.valueOf(i));
		}
		
		for (int i =0 ; i<5; i++) {
			at.add(String.valueOf(i));
		}
		System.out.println(at);
		System.out.println(duplicate(at));

	}
	
	public static Set<String> duplicate(ArrayList<String> dup){
		Set<String> result = new HashSet<String>();
		Set<String> temp = new HashSet<String>();
		int k = dup.size();
		for(String addto :dup) {
			if(!temp.add(addto)) {
				result.add(addto);
				
			}
			
		}
		return result;
	}

}
