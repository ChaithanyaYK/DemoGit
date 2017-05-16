import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartMoveto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:\\sjar\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//span[.='Electronics']")).click();
		WebDriverWait wait=new WebDriverWait(d, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Lenovo']")));
		WebElement Len = d.findElement(By.xpath("//span[.='Lenovo']"));   
		Actions a=new Actions(d);
		a.moveToElement(Len).click().perform();
		
	}

}
