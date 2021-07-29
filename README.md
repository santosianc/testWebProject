# testWebProject
Teste web automatizado realizado durante a formação QA da Stefanini.
Nele foi utilizado o site https://opensource-demo.orangehrmlive.com/ para realização dos testes que consistiam em dois cenários:
1- Cenário login

Realizar Login com Sucesso:
	Quando informar o campo Usarname como "<usuario>"
	E informar o campo Passworld como "<senha>"
	E clicar no botao Login
	Entao o sistema devera autorizar o login, exibindo pagina contendo o Dashboard

2- Funcionalidade Administrador

Pesquisar usuário:
	Quando acionar o menu Admin
	E informar o campo de busca Username como "<usuario>"
	E informar o campo de busca User Role como "<perfil>"
	E informar o campo de busca Employee Name como "<nomeFuncionario>"
	E informar o campo de busca Status como "<situacao>"
	E clicar no botao Search
	Entao o sistema devera apresentar lista com o resultado da busca de acordo com os filtros 
