package pizza.spring.selenium;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommanderUnePizzaIntegrationTest {
	
	private WebDriver webDriver;
	
	 @Before
	  public void createWebDriver() {
	    webDriver = new ChromeDriver();
	  }

	  @After
	  public void closeWebDriver() {
	    webDriver.quit();
	  }
	  
	  @Test
	  public void commanderSansProblemes() throws Exception {
		    
		  	PageRecap pageFinale = PageAccueil.openWith(webDriver)
		  						.clickOnSearch()
		  						.ChoixPizza("Regina")
		  						.attendre()
		  						.IndiqueNom("Richard")
		  						.attendre()
		  						.IndiqueNumero("0606060606")
		  						.attendre()
		  						.CliquerSurCommander();
		  	
		  	assertTrue(pageFinale.isLinkPresent());
		  }
	  
	  @Test
	  public void commanderSansNumero() throws Exception {
		    
		  	PageRecap pageFinale = PageAccueil.openWith(webDriver)
		  						.clickOnSearch()
		  						.ChoixPizza("Regina")
		  						.attendre()
		  						.IndiqueNom("Richard")
		  						.attendre()
		  						.CliquerSurCommander();
		  	
		  	assertFalse(pageFinale.isLinkPresent());
		  }
	  
	  @Test
	  public void commanderSansPizza() throws Exception {
		    
		  	PageRecap pageFinale = PageAccueil.openWith(webDriver)
		  						.clickOnSearch()
		  						.IndiqueNom("Richard")
		  						.attendre()
		  						.CliquerSurCommander();
		  	
		  	assertFalse(pageFinale.isLinkPresent());
		  }

}
