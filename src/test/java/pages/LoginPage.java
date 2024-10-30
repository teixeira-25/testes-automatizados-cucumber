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
    private By msgAlertSucesso = By.cssSelector("#toast_notification > div:nth-child(2) > div > div");
    protected WebDriver driver = new ChromeDriver();
    private By provaHome = new By.ById("top_menu");


    public void abrirBug()
    {
        WebDriverManager.chromedriver().setup();
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
        driver.findElement(msgAlertSucesso).getText();
        return null;
    }
    public void fecharBug()
    {
        driver.quit();
        if (driver == null) {

        }
    }
    public void acessoHome()
    {
        driver.findElement(provaHome);
    }
}