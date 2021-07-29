package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepdefinitions.Hooks;

public class MetodosUteis {

	protected WebDriver driver;

//de acordo com o vódep
	public void esperarElemento(WebElement elemento) {
		driver = Hooks.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(elemento));
	}
	
	//metodo para os campos de marcação -
	public void selecionar(WebElement elemento, String texto) {
		driver = Hooks.getDriver();
		Select dropDown = new Select(elemento);
		dropDown.selectByVisibleText(texto);
	}

}
