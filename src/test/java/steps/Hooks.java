package steps;

import io.cucumber.java.*;
import org.junit.Before;
import pages.LoginPage;

public class Hooks extends LoginPage
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
}