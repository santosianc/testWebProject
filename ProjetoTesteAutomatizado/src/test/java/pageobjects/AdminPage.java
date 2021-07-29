package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class AdminPage extends MetodosUteis {
	
	protected WebDriver driver;
	
	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how = How.ID, using = "menu_admin_viewAdminModule")
	private WebElement menuAdmin;
	
	@FindBy (how = How.ID, using = "searchSystemUser_userName")
	private WebElement campoUsuario;
	
	@FindBy (how = How.ID, using = "searchSystemUser_userType")
	private WebElement campoPerfil;
	
	@FindBy (how = How.ID, using = "searchSystemUser_employeeName_empId")
	private WebElement campoNomeFuncionario;
	
	@FindBy (how = How.ID, using = "searchSystemUser_status")
	private WebElement campoSituacao;
	
	@FindBy (how = How.ID, using = "searchBtn")
	private WebElement btnPesquisar;
	
	public void menuAdmin() {
		esperarElemento(menuAdmin);
		menuAdmin.click();
	}
	
	public void preencherUsuarioBusca (String usuario) {
		esperarElemento(campoUsuario);
		campoUsuario.clear(); //pode vir algum dado ja, por isso � bom usar o clear 
		campoUsuario.sendKeys(usuario);
		
	}
	
	public void preencherPerfilBusca (String perfil) {
		esperarElemento(campoPerfil);
		selecionar(campoPerfil, perfil);
		
	}
	
	public void preencherNomeFuncionarioBusca (String nomeFuncionario) {
		esperarElemento(campoNomeFuncionario);
		campoNomeFuncionario.clear(); //pode vir algum dado ja, por isso � bom usar o clear 
		campoNomeFuncionario.sendKeys(nomeFuncionario);
		
	}
	
	public void preencherSituacaoBusca (String situacao) {
		esperarElemento(campoSituacao); //aqui o professor deixou campoperfil achoq ue esqueceu 
		selecionar(campoSituacao, situacao);
		
	}
	
	public void clicarBotaoPesquisar() {
		esperarElemento(btnPesquisar);
		btnPesquisar.click();
	}
	
	public void validarLinkUsuario(String usuario) {
		WebElement linkUsuario = driver.findElement(By.linkText(usuario));
		esperarElemento(linkUsuario);
		assertTrue(linkUsuario.isDisplayed());
	}

}
