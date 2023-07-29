import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.Map;

public class TestCases {

    @Test
    public void TestcaseForTheTask1Scenario1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(20000);

  /*      //LogIn
        WebElement LoginBtn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        LoginBtn.click();
        WebElement emailTextBox = driver.findElement(By.id("ap_email"));
        emailTextBox.sendKeys("raniaelsayedmohamed1@gmail.com");
        WebElement continueBtn = driver.findElement(By.id("continue"));
        continueBtn.click();


        WebElement passwordTextBox = driver.findElement(By.id("ap_password"));
        passwordTextBox.sendKeys("Rania12**");
        WebElement signBtn = driver.findElement(By.id("signInSubmit"));
        signBtn.click();
*/
        WebElement searchTextbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchTextbox.sendKeys("car accessories");
        searchTextbox.sendKeys(Keys.ENTER);


        WebElement first_item = driver.findElement(By.xpath(" //div [ @data-index = '3']"));
        first_item.click();

        WebElement AddTocart = driver.findElement(By.id("add-to-cart-button"));
        AddTocart.click();


        String success_messageKeyWord = "Added to Cart";
        WebElement success_message = driver.findElement(By.xpath("//*[contains(text(), '" + success_messageKeyWord + "')]"));
        assert success_message.isDisplayed();
        System.out.println("Item added to the cart successfully!");


        WebElement GoToCart = driver.findElement(By.id("nav-cart-text-container"));
        GoToCart.click();

        String searchQuery = "car";
        WebElement cartItem = driver.findElement(By.xpath("//span[contains(text(), '" + searchQuery + "')]"));


    }
}