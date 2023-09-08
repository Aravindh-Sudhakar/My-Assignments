package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) {

     
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		WebElement men = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions mf=new Actions(driver);
		mf.moveToElement(men).perform();
		
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		WebElement sprtshs = driver.findElement(By.xpath("//div[@class='child-cat-count ']"));
		System.out.println(sprtshs.getText());
	}

}
