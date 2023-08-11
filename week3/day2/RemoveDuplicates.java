package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
	
		String text="We learn java basics as part of java sessions in java week1";
		String[] split =text.split(" ");
		for(int i=0;i<split.length;i++) {
			System.out.println(split[i]);
		}
	List <String> ar=new ArrayList<String>();
	for (int i=0;i<split.length;i++) {
		ar.add(split[i]);
	}
	System.out.println(ar);
		Set <String> jv=new LinkedHashSet <String>();
		for(int i=0;i<split.length;i++) {
			jv.add(split[i]);	
		}
		System.out.println(jv);
	}

}
