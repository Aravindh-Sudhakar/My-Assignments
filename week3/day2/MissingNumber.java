package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
	int n[]= {1,2,2,4,6,7,7,9,10};

	Set <Integer> num=new TreeSet<Integer>(); 
	
	for(int i=0;i<n.length;i++) {
		num.add(n[i]);
	}
	System.out.println(num);
	
	List<Integer> mn=new ArrayList<Integer>();

	mn.addAll(num);
	System.out.println(mn);
	int n1=mn.size()+1;
	for(int i=1;i<=n1;i++) {
		if(!mn.contains(i)) {
		System.out.println(i);
		}	
		}
	}
	
	}


