package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {


		String str="changeme";
		char[] ca=str.toCharArray();
		
		for(int i=0;i<ca.length;i++) {
			if(i%2!=0) {
				char a=ca[i];
				char upperCase = Character.toUpperCase(a);
				System.out.print(upperCase);
			}else{
				System.out.print(ca[i]);
			}
			
		}
		
		

	}

}
