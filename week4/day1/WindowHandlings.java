package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandlings {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Click & Confirm new window Opens
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> win=new ArrayList<String>(windowHandles);
		driver.switchTo().window(win.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(win.get(0));
		
		//Find the number of openend tabs
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> win2=new ArrayList<String>(windowHandles2);
		System.out.println("Size of opened Window is"+" "+win2.size());
		for(int i=1;i<win2.size();i++) {
			driver.switchTo().window(win2.get(i));
			driver.close();
		}
		driver.switchTo().window(win2.get(0));
		
		//Close all windows except primary
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> win3=new ArrayList<String>(windowHandles3);
		for(int i=1;i<win3.size();i++) {
			driver.switchTo().window(win3.get(i));
			driver.close();
		}
		driver.switchTo().window(win3.get(0));
		System.out.println("Primary window is"+" "+driver.getTitle());
		
		//Open Delay window
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
        Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> win4 = new ArrayList<String>(windowHandles4);
		Thread.sleep(2000);
		for(int i=1;i<win4.size();i++) {
			driver.switchTo().window(win4.get(i));
			driver.close();
		}
	}

}
