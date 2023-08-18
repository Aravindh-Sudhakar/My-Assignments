package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BuyTheValue {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//div[@class='product-image']/a")).click();
        driver.findElement(By.xpath("//input[@name='wk_zipcode']")).sendKeys("605651");
        driver.findElement(By.xpath("//input[@class='btn']")).click();
        driver.findElement(By.xpath("//button[@id='product-add-to-cart']/span")).click();
        Thread.sleep(2000);
        
        WebElement view = driver.findElement(By.xpath("//a[text()='View Cart']"));
        
             //Javascript method
      		//Due to improper handling of dom , elementinterceptor /javascript exception
        driver.executeScript("arguments[0].click();", view);
        
        driver.findElement(By.xpath("//input[@id='checkout']")).click();
        
        Alert alt=driver.switchTo().alert();
        alt.accept();
        
	}

}
