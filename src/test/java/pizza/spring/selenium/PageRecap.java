package pizza.spring.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageRecap {

	private WebDriver webDriver;

	public PageRecap(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public boolean isLinkPresent() {
		if (webDriver.findElement(By.xpath("//*[contains(text(),'Récapitulatif')]")) != null) {
			return  true;
		}else {
			return false;
		}
	}
}
