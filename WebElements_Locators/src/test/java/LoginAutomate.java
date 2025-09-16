import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASUS\\git\\Webdriver\\Webdriver\\target\\chromedriver.exe");

		WebDriver browser = new ChromeDriver();

		browser.get("https://www.facebook.com/");

		WebElement email = browser.findElement(By.id("email"));
		email.sendKeys("vichuvishwa004@gmail.com");

		WebElement password = browser.findElement(By.name("pass"));
		password.sendKeys("VichuVishwa@46");

//		WebElement loginClick = browser.findElement(By.linkText("Log in"));
//		loginClick.click();

		browser.findElement(By.partialLinkText("Log")).click();
		// loginClick.click();

		List<WebElement> listName = browser.findElements(By.tagName("a"));

		for (WebElement list : listName) {

			String text = list.getText();

			System.out.println(text);
		}

		WebElement emailTwo = browser.findElement(By.xpath("//input[@name='email']"));
		emailTwo.sendKeys("vichu@gmail.com");

		WebElement passTwo = browser.findElement(By.xpath("//input[@name='pass']"));
		passTwo.sendKeys("vishwa@86524");

		if (emailTwo.isDisplayed()) {

			emailTwo.clear();

			emailTwo.sendKeys("Akash@gamil.com");

			System.out.println("email id is updated");
		}

		Thread.sleep(3000);
		browser.quit();

	}

}
