package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
		
		String nm="Aravindh";
		String lowerCase = nm.toLowerCase();
		char[] charArray=lowerCase.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			System.out.println(charArray[i]);
		}

		Set<Character> uniq=new HashSet<Character>();
		
		for(int i=0;i<charArray.length;i++) {
			boolean add=uniq.add(charArray[i]);
		}
		System.out.println(uniq);
	
		}

		
		
		
		
	}


