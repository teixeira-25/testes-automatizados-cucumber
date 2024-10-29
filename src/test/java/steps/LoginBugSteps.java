package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginBugSteps
{
    @Dado("que estou na pagina de login")
    public void que_estou_na_pagina_de_login() {
    }
    @Quando("o usuario preenche o campo do email {string}")
    public void o_usuario_preenche_o_campo_do_email(String email) {
    }
    @Quando("preenche a senha {string}")
    public void preenche_a_senha(String senha) {
    }
    @Quando("clica em entrar")
    public void clica_em_entrar() {
    }
    @Entao("o sistema da acesso a home")
    public void o_sistema_da_acesso_a_home() {
    }
    @Entao("o sistema exibe a mensagem {string}")
    public void o_sistema_exibe_a_mensagem(String msgAlert) {
    }
}
