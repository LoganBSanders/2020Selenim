package day6.Warmup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class VerifyThatElementsGone {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        Thread.sleep(1000);
        driver.findElement(By.id("disappearing_button")).click();
        if (driver.findElements(By.id("disappearing_button")).size()==0){
            System.out.println("Passes");
        }else {
            System.out.println("Failed");
        }

        List <WebElement> buttons =driver.findElements(By.tagName("button"));
        for(WebElement button : buttons){
            button.click();
            Thread.sleep(1000);
        }

        driver.quit();
    }
}
