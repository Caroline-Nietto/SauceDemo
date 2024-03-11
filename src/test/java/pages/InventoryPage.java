package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends CommonPage {

     public InventoryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickTitleProduct(String productId){
        String idDinamic = "item_" + productId + "_title_link";
        driver.findElement(By.id(idDinamic)).click();
    }

}
