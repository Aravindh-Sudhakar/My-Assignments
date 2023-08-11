package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		
		String s="PayPal India";
		char[] ca=s.toCharArray();
		
		System.out.println(ca);
		
		Set<Character> cs=new LinkedHashSet<Character>();
		Set<Character> ds=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			boolean add=cs.add(ca[i]);
			if(!add) {
				ds.add(ca[i]);
			}
			
		}
		System.out.println(cs);
		System.out.println(ds);
		
	
		List<Character> s1=new ArrayList<Character>();
	s1.addAll(cs);
		System.out.println(s1);
		
		String str1="";
		for(int i=0;i<s1.size();i++) {
			 if(s1.get(i)!=' ') {
			 str1=str1+s1.get(i);
			 }
		}
		
		System.out.println(str1);
	}

}
