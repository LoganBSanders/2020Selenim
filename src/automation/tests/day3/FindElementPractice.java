package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utulities.DriverFactory;

public class FindElementPractice {
    public static void main(String[] args) throws InterruptedException {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver =new ChromeDriver();



        WebDriver driver = DriverFactory.createDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName = driver.findElement(By.name("full_name"));

        fullName.sendKeys("Ozan Doganay");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("odo@gmail.com");

        WebElement signUp = driver.findElement(By.name("wooden_spoon"));
        signUp.click();

        Thread.sleep(3000);

        driver.quit();
    }
}
