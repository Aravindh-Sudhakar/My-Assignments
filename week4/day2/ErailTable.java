package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		WebElement frm = driver.findElement(By.id("txtStationFrom"));
		frm.clear();
		frm.sendKeys("MAS"+Keys.TAB);
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("CBE"+Keys.TAB);
		driver.findElement(By.id("buttonFromTo")).click();
		
		WebElement table = driver.findElement(By.xpath("//div[@id='divTrainsList']/table[1]/tbody"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		System.out.println(row.size());
		
		List<WebElement> seccol = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr/td[2]"));
        for(WebElement	colvalues : seccol) {
        	System.out.println(colvalues.getText()); 
				
			
        }
	}

}
