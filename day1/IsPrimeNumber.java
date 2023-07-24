package week1.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int n=15;
		int rem=0;
		for(int i=2;i<n;i++) {
			
		
			if (n%i==0){
				rem++;
			}
		}
			if(rem==0){
				System.out.println("its a prime");
			}else {
				 
				System.out.println("Its not a prime number");
			}
		}
		}




