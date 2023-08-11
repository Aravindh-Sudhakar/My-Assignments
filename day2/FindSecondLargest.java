package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {3,2,11,4,6,7};
		
		Set<Integer> dt=new TreeSet<Integer>();
		
		for(int i=0;i<data.length;i++) {
			dt.add(data[i]);
		}
		
		System.out.println(dt);
		
		List<Integer> lt=new ArrayList<Integer>();
		lt.addAll(dt);
		System.out.println(lt.get(lt.size()-2));
		
	
		
		
	}

}
