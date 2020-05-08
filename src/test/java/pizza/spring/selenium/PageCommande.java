package pizza.spring.selenium;

import static org.junit.Assert.assertTrue;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertFalse;

public class PageCommande {
	private WebDriver webDriver;

	public PageCommande(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public PageCommande ChoixPizza(String nomPizza) {
	
		Select pizzaChoisie = new Select(webDriver.findElement(By.id("pizzaId")));
		pizzaChoisie.selectByVisibleText(nomPizza);
		return this;
	}

	public PageCommande IndiqueNom(String nomPersonne) {
		
		WebElement nom = webDriver.findElement(By.name("nom"));
		nom.sendKeys(nomPersonne);
		return this;
	}
	
	public PageCommande IndiqueNumero(String numeroTel) {
		
		WebElement numero = webDriver.findElement(By.name("telephone"));
		numero.sendKeys(numeroTel);
		return this;
	}
	
	public PageRecap CliquerSurCommander() {
		
		WebElement commandButton = webDriver.findElement(By.cssSelector("button"));
		commandButton.click();
		
		return new PageRecap(webDriver);
		
	}
	public PageCommande attendre() {
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	  }
}
