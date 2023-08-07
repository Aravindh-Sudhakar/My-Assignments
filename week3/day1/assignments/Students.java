package week3.day1.assignments;

public class Students {

	    public int getstudentinfo(int id) {
		System.out.println("Student ID"+" "+id);
		return id;
	    }
	    
		public void getstudentinfo(int i,String name) {
			System.out.println("Student ID"+" "+i+" "+"Student Name"+" "+name);
			
		}
		
		public String getstudentinfo(String email,long phno) {
			System.out.println("Student email ID"+" "+email+" "+"Phno"+" "+phno);
			return email+" "+phno;
		}
	public static void main(String[] args) {
		Students st=new Students();
		st.getstudentinfo(01);
		st.getstudentinfo(01,"Aravindh");
		st.getstudentinfo("aravindhharish94@gmail.com", 8098814752l);


	}

}
