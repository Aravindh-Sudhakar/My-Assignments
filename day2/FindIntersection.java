package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] n1= {3,2,11,4,6,7};
		int[] n2= {1,2,8,4,9,7};
		
		for(int i=0;i<n1.length;i++) {
			for (int j=0;j<n2.length;j++) {
				if(n1[i]==n2[j]) {
					System.out.println(n1[i]);
					
				}
			}
		}

	}

}
