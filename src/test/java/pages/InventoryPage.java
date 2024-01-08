package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends BasePage{

     //@FindBy(id = "item_4_title_link")
    //WebElement lnkProductTitle;


    public InventoryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickTitleProduct(String productId){
        String idDinamic = "item_" + productId + "_title_link";
        driver.findElement(By.id(idDinamic)).click();
    }

}
