package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		int n1=0,n2=1,sum=0,i;
		System.out.println(n1+" "+n2);
		
		for(i=0;i<11;i++)
		{
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
			
		}
		

	}

}
