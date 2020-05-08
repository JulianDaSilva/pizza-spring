package pizza.spring.selenium;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAccueil {
	
	private WebDriver webDriver;

	public PageAccueil(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public PageAccueil open() {
		webDriver.navigate().to("http://localhost:8080/pizzaspring");
		return this;
	}

	public static PageAccueil openWith(WebDriver webDriver) {
		PageAccueil homePage = new PageAccueil(webDriver);
		homePage.open();
		return homePage;
	}

	public PageCommande clickOnSearch() {
		WebElement searchButton = webDriver.findElement(By.linkText("Commander"));
		searchButton.click();
		return new PageCommande(webDriver);
	}
}
