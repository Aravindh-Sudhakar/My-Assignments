package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykka {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement br = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions brands=new Actions(driver);
		brands.moveToElement(br).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-150nd8c']/a")).click();
		String title = driver.getTitle();
		if(title.contains("L'Oreal Paris")) {
			System.out.println(title);
		}
		
		driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		
		//WebElement shampoo = driver.findElement(By.xpath("//div[@class='css-3i7s5s']/span"));
		//WebElement colorpro = driver.findElement(By.xpath("(//div[@class='css-3i7s5s']/span)[2]"));
		//WebElement filter = driver.findElement(By.xpath("//div[@class='css-rtde4j']"));
		
		driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
		
		Set<String> win = driver.getWindowHandles();
		List<String> winh=new ArrayList<String>(win);
		driver.switchTo().window(winh.get(1));
		
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		WebElement mrp = driver.findElement(By.xpath("//span[@class='css-1jczs19']"));
		System.out.println(mrp.getText());
		
		driver.findElement(By.xpath("//button[@class=' css-13zjqg6']/span[text()='Add to Bag']")).click();
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		WebElement gta = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']"));
		String text = gta.getText();
		System.out.println("Grand Total Amount is :"+" "+text);
		
		WebElement proceed = driver.findElement(By.xpath("//span[text()='Proceed']"));
		proceed.click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		WebElement finaltotal = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']"));
		String text2 = finaltotal.getText();
		if(text.equals(text2)){
			System.out.println("Grand total is Same as per final total");
		}else {
			System.out.println("It is not same");
		}
		
		
	}

}
