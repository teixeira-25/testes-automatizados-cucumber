package steps;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.junit.Before;
import pages.LoginPage;

public class LoginBugSteps
{
    LoginPage loginPage = new LoginPage();

    @Before
    public void antesDeTudo()
    {
        loginPage.abrirBug();
    }

    @After
    public void depoisDeTudo()
    {
        loginPage.fecharBug();
    }

    @Dado("que estou na pagina de login")
    public void que_estou_na_pagina_de_login()
    {
        loginPage.abrirBug();
    }
    @Quando("o usuario preenche o campo do email {string}")
    public void o_usuario_preenche_o_campo_do_email(String email)
    {
        loginPage.preencherEmail(email);
    }
    @Quando("preenche a senha {string}")
    public void preenche_a_senha(String senha)
    {
        loginPage.preencherSenha(senha);
    }
    @Quando("clica em entrar")
    public void clica_em_entrar()
    {
        loginPage.clicarEntrar();
    }
    @Entao("o sistema exibe a mensagem {string}")
    public void o_sistema_exibe_a_mensagem(String msgAlerta)
    {
        String msgSucesso = loginPage.msgAlert();
        Assert.assertEquals(msgAlerta, msgSucesso);
    }
    @Entao("o sistema da acesso a home")
    public void o_sistema_da_acesso_a_home()
    {
        loginPage.acessoHome();
    }
}
