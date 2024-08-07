package sampleone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingOneTwoThree {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://www.asos.com/men/");
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("men-floor")).click();
		driver.findElement(By.xpath("(//span[@class='cSfPh9_']//span[contains(text(),'Clothing')])[2]")).click();
		System.out.println("This is completed now");
		driver.close();
		

	}

}
