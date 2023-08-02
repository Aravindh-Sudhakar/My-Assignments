package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aravindh");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8098814752");
		 driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Aravindh@94");
		 
		 WebElement day = driver.findElement(By.name("birthday_day"));
		 Select dy=new Select(day);
		 dy.selectByValue("26");
		 
		 WebElement mnth = driver.findElement(By.name("birthday_month"));
		 Select mth=new Select(mnth);
		 mth.selectByVisibleText("Oct");
		 
		 WebElement yar = driver.findElement(By.name("birthday_year"));
		 Select yr=new Select(yar);
		 yr.selectByValue("1994");
		 
		 driver.findElement(By.xpath("//label[text()='Female']")).click();
	}

}
