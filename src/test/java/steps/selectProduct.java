package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class selectProduct {
    // Atributos
    final WebDriver driver;

    // Definindo objetos para receber os mapeamentos de página
    private CartPage cartPage;
    private HomePage homePage;
    private InventoryPage inventoryPage;
    private InventoryItemPage inventoryItemPage;


    // Construtor
    public selectProduct(BasePage basePage){
       this.driver = basePage.driver;   // passagem de bola = integração selenium dentro e fora
    }


    @Given("I access SauceDemo store")
    public void i_access_sauce_demo_store() {
        driver.get("https://www.saucedemo.com");
    }

    @When("I filled a user {string} and password {string}")
    public void i_filled_a_user_and_password(String user, String password) {
        homePage.logar(user, password);
    }

    @And("I click in Login")
    public void i_click_in_login() {
       homePage.clickBtnLogin();
    }

    @Then("show page's title {string}")
    public void showPageSTitle(String pageTitle) {
          assertEquals(inventoryPage.readPageTitle(), pageTitle);
    }

    @And("show cart's link")
    public void show_cart_s_link() {
        assertTrue(inventoryPage.imgCart.isDisplayed());
    }

    @When("I click in product {string}")
    public void i_click_in_product(String productId) {
        inventoryPage.clickTitleProduct(productId);
    }
    @Then("I verify the product title {string}")
    public void i_verify_the_product_title(String productTitle) {
        assertEquals(inventoryItemPage.readTitleProduct() ,productTitle);
    }
    @And("I verify the product price {string}")
    public void i_verify_the_product_price(String productPrice) {
        assertEquals(inventoryItemPage.readPriceProduct(), productPrice);
    }
    @And("I click in Add to Cart")
    public void i_click_in_add_to_cart() {
        inventoryItemPage.clickButtonAddOrRemoveCart();
    }
    @And("I click in Cart icon")
    public void i_click_in_cart_icon() {
        inventoryPage.clickCart();
    }

    @And("I verify the quantity is {string}")
    public void i_verify_the_quantity_is(String quantity) {
        assertEquals(cartPage.readQuantityCart(), quantity);
    }

    @Then("I verify the product title {string} in cart")
    public void i_verify_the_product_title_in_cart(String productTitle) throws InterruptedException {
       assertEquals(cartPage.readTitleProductCart(), productTitle);
        Thread.sleep(2000);
    }

    @Then("I verify the product price {string} in cart")
    public void i_verify_the_product_price_in_cart(String productPrice) {
        assertEquals(cartPage.readPriceProductCart(), productPrice);
    }

    @Then("I verify the page's title {string}")
    public void iVerifyThePageSTitle(String pageTitle) {
        assertEquals(cartPage.readPageTitle(), pageTitle);
    }
}