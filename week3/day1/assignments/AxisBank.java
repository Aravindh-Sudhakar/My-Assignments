package week3.day1.assignments;

public class AxisBank extends BankInfo {

	public void deposit() {
		super.deposit();
		System.out.println("Deposit only in Machine");
	}
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		
		ab.deposit();
		ab.saving();
		ab.fixed();

	}

}
