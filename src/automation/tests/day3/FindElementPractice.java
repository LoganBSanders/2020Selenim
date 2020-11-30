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
        Thread.sleep(2000);
        WebElement fullName = driver.findElement(By.name("full_name"));

        fullName.sendKeys("Ozan Doganay");
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("odo@gmail.com");
        Thread.sleep(2000);
        WebElement signUp = driver.findElement(By.name("wooden_spoon"));
        signUp.click();

        Thread.sleep(2000);


        String expected = "Thank you for signing up. Click the button below to return to the home page.";
        WebElement message = driver.findElement(By.className("subheader"));
        String actual = message.getText();

        if (expected.equalsIgnoreCase(actual)){
            System.out.println("Passed");
        }else{
            System.out.println("failed");
        }
        Thread.sleep(2000);

        driver.quit();
    }
}
