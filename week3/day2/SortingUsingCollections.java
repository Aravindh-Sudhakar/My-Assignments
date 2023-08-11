package week3.day2;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


public class SortingUsingCollections {

	public static void main(String[] args) {
	
		String cn="HCL,Wipro,Aspire Systems,CTS";
		String[] split=cn.split(",");
		for(int i=0;i<split.length;i++) {
			System.out.println(split[i]);
		}
		int length = split.length;
		System.out.println(length);
		List <String> nn=new ArrayList<String>();
		for(int i=0;i<split.length;i++) {
			nn.add(split[i]);
			System.out.println(split[i]);
		}
		Collections.sort(nn);
		System.out.println(nn);
		for(int i=nn.size()-1;i>=0;i--) {
			System.out.println(nn.get(i));
		}
		
		
	
}
}

