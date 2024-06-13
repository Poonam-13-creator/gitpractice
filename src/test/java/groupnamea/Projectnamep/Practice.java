package groupnamea.Projectnamep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://calvinklein.nnnow.com/calvin-klein-underwear-solid-push-up-plunge-bra-BU1OPD6CIES");	
		driver.manage().window().maximize();
		driver.findElement(By.className("nw-mainnav-text")).click();
		driver.findElement(By.xpath("(//span[@class='nw-producttags-text'][normalize-space()='NEW ARRIVAL - SS24'])[1]")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
