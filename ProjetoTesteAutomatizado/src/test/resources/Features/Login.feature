#language: pt
@Login @End2End
Funcionalidade: Login

	Contexto:
		Dado que o usuario esteja na pagina principal do sistema
	
	@RealizarLogin @SmokeTest	
	Esquema do Cenario: Realizar Login com Sucesso
		Quando informar o campo Usarname como "<usuario>"
		E informar o campo Passworld como "<senha>"
		E clicar no botao Login
		Entao o sistema devera autorizar o login, exibindo pagina contendo o Dashboard.
		
	Exemplos:
		|usuario|senha|
		|Admin|admin123|	
		|Ademilsu|ademar|	
		
	
