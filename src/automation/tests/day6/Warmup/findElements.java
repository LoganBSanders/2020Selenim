package day6.Warmup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        Thread.sleep(3000);
       List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link: links) {
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
            System.out.println();

        }

        for (int i = 1; i <links.size() ; i++) {
            links.get(i).click();
            Thread.sleep(2000);

            driver.navigate().back();

            Thread.sleep(2000);
           links = driver.findElements(By.tagName("a"));
        }
        driver.quit();
    }
}
