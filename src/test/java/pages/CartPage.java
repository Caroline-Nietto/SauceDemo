package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {

    @FindBy(css = "div.inventory_item_name")
    WebElement lblTitleProduct;

    @FindBy(css = "div.inventory_item_price")
    WebElement lblPriceProduct;

    @FindBy(css = "div.cart_quantity")
    WebElement lblQuantity;


    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public String readTitleProductCart(){
        return lblTitleProduct.getText();
    }

    public String readPriceProductCart(){
        return lblPriceProduct.getText();
    }

    public String readQuantityCart(){ return lblQuantity.getText();}

}
