package week3.day1.assignments;

public class Automation extends MultipleLanguage implements TestTool {

	

	public void java() {
		System.out.println("Java Language");
		
	}

	public void selenium() {
		System.out.println("Selenium Tool");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby Language");
		
	}

public static void main(String[] args) {
	
		Automation at=new Automation();
		at.java();
		at.selenium();
		at.ruby();
		at.python();

	}

	

}
