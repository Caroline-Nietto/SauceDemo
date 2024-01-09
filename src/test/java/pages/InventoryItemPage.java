package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryItemPage extends CommonPage {

    @FindBy(css = "div.inventory_details_name large_size")
    WebElement lblTitleProduct;

    @FindBy(css = "div.inventory_details_price")
    WebElement lblPriceProduct;

    @FindBy(css = "button.btn btn_primary btn_small btn_inventory")
    WebElement btnAddOrRemoveCart;


    public InventoryItemPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String readTitleProduct(){
        return lblTitleProduct.getText();
    }

    public String readPriceProduct(){
        return lblPriceProduct.getText();
    }

    public String readTextBtnAddOrRemoveCart(){
        return btnAddOrRemoveCart.getText();
    }

    public void clickButtonAddOrRemoveCart(){
        btnAddOrRemoveCart.click();
    }

}
