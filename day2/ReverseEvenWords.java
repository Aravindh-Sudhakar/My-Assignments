package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test="I am a Software Tester";
		String[] spt=test.split(" ");
for(int i=0;i<spt.length;i++) {
	System.out.println(spt[i]);
}
System.out.println("                          ");
for(int i=0;i<spt.length;i++) {
	if(i%2!=0) {
		String a=spt[i];
		StringBuilder a1=new StringBuilder();
		a1.append(a);
		a1.reverse();
		System.out.print(a1+" ");
	}else {
		String b1=spt[i];
		System.out.print(b1+" ");
	}
	
}

	}

}
