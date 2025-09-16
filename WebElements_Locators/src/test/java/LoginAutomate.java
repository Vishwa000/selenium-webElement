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

		browser.manage().window().maximize();

		WebElement email = browser.findElement(By.id("email"));
		WebElement password = browser.findElement(By.name("pass"));
		WebElement loginClick = browser.findElement(By.partialLinkText("Log"));
//		WebElement loginClick = browser.findElement(By.linkText("Log in"));

		email.sendKeys("vichuvishwa004@gmail.com");
		password.sendKeys("VichuVishwa@46");
		loginClick.click();
//		loginClick.click();

		List<WebElement> listName = browser.findElements(By.tagName("a"));

		for (WebElement list : listName) {

			String text = list.getText();

			System.out.println(text);
		}

		WebElement emailTwo = browser.findElement(By.xpath("//input[@name='email']"));
		emailTwo.sendKeys("vichu@gmail.com");

		if (emailTwo.isDisplayed()) {

			emailTwo.clear(); // its check the placeholder has value or not

			emailTwo.sendKeys("Akash@gamil.com");

			System.out.println("email id is updated");

		}
		WebElement passTwo = browser.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		passTwo.sendKeys("vishwa@86524");

		WebElement loginClickTwo = browser.findElement(By.xpath("//button[@id='loginbutton']"));

		if (loginClickTwo.isEnabled()) {

			loginClickTwo.click(); // its check the botton enable or not
			System.out.println("login button is enabled");

		} else {
			System.out.println("Login button is disabled");
		}

		Thread.sleep(3000);
		browser.quit();

	}

}
