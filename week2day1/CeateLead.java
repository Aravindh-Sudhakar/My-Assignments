package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CeateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// hari.radhakrishnan@qeagle.com
		  // Leaf$1234
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aravindh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sudhakar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Harish");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Filing Department");
		driver.findElement(By.name("description")).sendKeys("I can audit all the files");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aravindhharish94@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
	}

}
