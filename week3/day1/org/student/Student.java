package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department {
	
	public void studentname() {
		System.out.println("Aravindh");
	}
	
	public void studentdept() {
		System.out.println("ECE");
	}
	
	public void studentid() {
		System.out.println("123456");
	}

	public static void main(String[] args) {
		
Department dp=new Department();
dp.collegename();
dp.collegecode();
dp.collegerank();
dp.deptname();

Student st=new Student();
st.studentname();
st.studentdept();
st.studentid();
	}

}
