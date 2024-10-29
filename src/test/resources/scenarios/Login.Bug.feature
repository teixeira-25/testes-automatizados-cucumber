#language: pt
Funcionalidade: Login

  Cenario: Login com sucesso
    Dado que estou na pagina de login
    Quando o usuario preenche o campo do email "teixeirinha@local.dev"
    E preenche a senha "qwe123"
    E clica em entrar
    Entao o sistema da acesso a home

  Cenario: Email incorreto e senha correta
    Dado que estou na pagina de login
    Quando o usuario preenche o campo do email "teixeirinha123@gmail.com"
    E preenche a senha "qwe123"
    E clica em entrar
    Entao o sistema exibe a mensagem "Invalid email"

  Cenario: Email invalido e senha correta
    Dado que estou na pagina de login
    Quando o usuario preenche o campo do email "teixeirinha123"
    E preenche a senha "qwe123"
    E clica em entrar
    Entao o sistema exibe a mensagem "Invalid email"

  Cenario: Email invalido e senha incorreta
    Dado que estou na pagina de login
    Quando o usuario preenche o campo do email "teixeirinha123"
    E preenche a senha "1234"
    E clica em entrar
    Entao o sistema exibe a mensagem "Invalid email"

  Cenario: Email correto e senha incorreta
    Dado que estou na pagina de login
    Quando o usuario preenche o campo do email "teixeirinha@local.dev"
    E preenche a senha "1234"
    E clica em entrar
    Entao o sistema da acesso a home

  Cenario: Email e senha incorretos
    Dado que estou na pagina de login
    Quando o usuario preenche o campo do email "teixeirinha123@gmail.com"
    E preenche a senha "1234"
    E clica em entrar
    Entao o sistema da acesso a home