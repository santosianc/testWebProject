package pageobjects;


import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepdefinitions.Hooks;
import utils.MetodosUteis;

public class LoginPage extends MetodosUteis {
	
	protected WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how = How.ID, using = "txtUsername")
	private WebElement usuario;
	
	@FindBy (how = How.ID, using = "txtPassword")
	private WebElement senha;
	
	@FindBy (how = How.ID, using = "btnLogin")
	private WebElement btnLogin;
	
	//De acordo com o vídeo
	@FindBy (how = How.CSS, using = "h1:contains('Dashboard')") //h1 - "tag" - contains - "o conteudo da tag"
	private WebElement dashboard;
//	@FindBy (how = How.ID, using = "panel_draggable_1_2") //h1 - "tag" - contains - "o conteudo da tag"
//	private WebElement dashboard;
	
	
	//Estava usando esse, mas coloquei o outro no utils
//	public void esperarElemento(WebElement elemento) {
//		WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), 10);
//		wait.until(ExpectedConditions.visibilityOf(elemento));		
//	}
//	
	
////	de acordo com o vódep
//	public void esperarElemento(WebElement elemento) {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(elemento));		
//	}
	
	public void preencherUsuario(String nomeUsuario) {
		esperarElemento(usuario);
		usuario.sendKeys(nomeUsuario);
		
	}
	
	public void preencherSenha(String senhaUsuario) {
		esperarElemento(senha);
		senha.sendKeys(senhaUsuario);
		
	}
	
	public void clicarBotaoLogin() {
		esperarElemento(btnLogin);
		btnLogin.click();
	}
	
	public void validarDashboard() {
		esperarElemento(dashboard);
		assertTrue(dashboard.isEnabled());
	}

}	
