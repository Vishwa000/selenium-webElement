import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomate {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASUS\\git\\Webdriver\\Webdriver\\target\\chromedriver.exe");

		WebDriver browser = new ChromeDriver();

		browser.get("https://www.facebook.com/");

		WebElement email = browser.findElement(By.id("email"));
		email.sendKeys("vichuvishwa004@gmail.com");

		WebElement password = browser.findElement(By.name("pass"));
		password.sendKeys("VichuVishwa@46");

		WebElement loginClick = browser.findElement(By.linkText("Log in"));
		loginClick.click();

	}

}
