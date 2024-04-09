package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_20_1 {
	
	 public static void main(String[] args) throws Exception {
		 
		  // Launch the ChromeDriver browser
		  WebDriver driver = new ChromeDriver();
		  // Maximize the window
		  driver.manage().window().maximize();
		  // Navigate to the URL
	      driver.get("https://jqueryui.com/datepicker/");
	      // Switch to the iframe
	      WebElement e = driver.findElement(By.xpath("//*[@id='content']/iframe"));
	      driver.switchTo().frame(e);
	      //Select the next month and date of 22 in the calendar
	      driver.findElement(By.xpath("(//input[@id='datepicker'])[1]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-circle-triangle-e'])[1]")).click();
	      driver.findElement(By.xpath("(//a[normalize-space()='22'])[1]")).click();
	      // Print the selected date
	      WebElement x = driver.findElement(By.xpath("(//a[normalize-space()='22'])[1]"));
	      String a= x.getText();
	      System.out.println(a);
	      Thread.sleep(1000);
	      // Close the browser window and quit the webDriver
	      driver.close();
	      driver.quit();
	      }
}