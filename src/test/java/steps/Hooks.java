package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class Hooks{

    BasePage basePage;

    public Hooks(BasePage basePage) {
        this.basePage = basePage;
    }

    @BeforeEach
    public void iniciar() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        basePage.driver = new ChromeDriver(options);
        basePage.driver.manage().window().maximize();
        basePage.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }

    @AfterEach
    public void finalizar() {
        basePage.driver.quit();
    }
}