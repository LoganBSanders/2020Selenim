package day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utulities.BrowserUtils;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        driver.manage().window().maximize();
        BrowserUtils.wait(2);

        List<WebElement> ratioButtons = driver.findElements(By.tagName("input"));

        //String id = ratioButtons.getAttribute("id");
        for (WebElement radioButton: ratioButtons) {
            String id = radioButton.getAttribute("id");
            if (radioButton.isEnabled()){
            radioButton.click();
                System.out.println("Clicked on : " + id );
            BrowserUtils.wait(1);
        }
        else {
                System.out.println("Button is disabled on : " + id);
            }
        }



        //Thread.sleep(2000);
        driver.quit();


    }
}
