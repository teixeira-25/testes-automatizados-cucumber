package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage
{
    private By email = By.id("email");
    private By senha = By.id("pass");
    private By enter = By.id("login");
    private By msgAlertSucesso = By.cssSelector("#toast_notification > div > div > div");
    protected WebDriver driver;
    private By provaHome = new By.ById("top_menu");

    public void abrirBug()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://bug.dev.hill/signin");
    }

    public void preencherEmail(String emailUsuario)
    {
        driver.findElement(email).sendKeys(emailUsuario);
    }

    public void preencherSenha(String senhaUsuario)
    {
        driver.findElement(senha).sendKeys(senhaUsuario);
    }

    public void clicarEntrar()
    {
        driver.findElement(enter).click();
    }

    public String msgAlert()
    {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(msgAlertSucesso).getText();
    }

    public void fecharBug()
    {
        driver.quit();
        if (driver == null) {

        }
    }

    public void acessoHome()
    {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(provaHome);
    }
}
