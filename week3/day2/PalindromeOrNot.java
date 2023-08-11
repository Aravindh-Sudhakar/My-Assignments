package week3.day2;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String str="madam";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			char a=str.charAt(i);
			 rev=rev+a;
		}
		System.out.println(rev);
			if(str.equals(rev)) {
				System.out.println(rev+" "+"Its is a Palindrome");
			}else {
				System.out.println(rev+" "+"Is not a palindrome");
			}
		}

	}


