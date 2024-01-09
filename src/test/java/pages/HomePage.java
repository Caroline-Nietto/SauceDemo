package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    // O mapeamento cria ou reflete uma DSL
    // Domain Structured Language
    // Linguagem Estruturada de Dominio
    // Como chamamos na empresa


    // Elementos Web / Web Elements --> Os que serão mapeados
    @FindBy(id = "user-name")
    WebElement txtUser;

    @FindBy(id = "password")
    WebElement txtPassword;

    @FindBy(id = "login-button")
    WebElement btnLogin;

    // Construtor / Constructor

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Funções e Métodos
    public void logar(String user, String password){
        txtUser.sendKeys(user);
        txtPassword.sendKeys(password);
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }
}
