package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> a = new HashSet<Integer>();
		
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println(a);
		
		Iterator<Integer> it = a.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		if(!a.add(2)) {
			System.out.println("duplicate");
		}
		

	}

}
