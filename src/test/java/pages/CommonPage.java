package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage extends Base {

    @FindBy(id = "shopping_cart_container")
    public WebElement imgCart;

    @FindBy (css = "span.title")
    WebElement lblPageTitle;


    public CommonPage(WebDriver driver) {

        this.driver = driver;
    }

    // Função para retornar o título escrito na guia do browser

    public String lerTituloAba() {
        return driver.getTitle();
    }

    public void clickCart() {
        imgCart.click();
    }

    public String readPageTitle() {
        return lblPageTitle.getText();
    }
}
