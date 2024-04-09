package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_20_2 {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the ChromeDriver browser
		WebDriver driver = new ChromeDriver();
		// Launch the Website
		driver.get("https://www.guvi.in/");
		driver.manage().window().maximize();
	        Thread.sleep(1000);
	        // Click on the Sign in option
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary text-white px-4']")).click();
		// Input the required fields values
		driver.findElement(By.id("name")).sendKeys("Abdhul");
		driver.findElement(By.id("email")).sendKeys("testemailgv2000@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Guvi321");
		driver.findElement(By.id("mobileNumber")).sendKeys("6382956919");
		// Click on "Signup" button
		driver.findElement(By.id("signup-btn")).click();
		// Click on the login option
		driver.findElement(By.xpath("//a[contains(@class,'text-primary text-center px-4')]")).click();
		// Input the  required fields values
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testemailgv2000@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Guvi321");
		Thread.sleep(1000);
		// Click on "Login" button
		driver.findElement(By.xpath("//a[@id='login-btn']")).click();
		Thread.sleep(3000);
		// Confirm the  user is login successfully in the website
		driver.findElement(By.xpath("//button[@class='btn dropdown account-box-toggler']"));
		Thread.sleep(3000);
		String title= driver.getTitle();
		System.out.println(title);
		if (title.equalsIgnoreCase("Guvi | Courses")) {
			System.out.println("Logged in Successfully");
		} else {
			System.out.println("Logged in Failure");
		}
		driver.quit();
	}

}
