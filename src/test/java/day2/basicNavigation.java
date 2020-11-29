package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicNavigation {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new  ChromeDriver();
        driver.get("http:google.com");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        String title = driver.getTitle();
        String expectedTitle = "Google";
        System.out.println("Title is...."+title);
        if (expectedTitle.equals(title)){
            System.out.println("TEST PASSED");
        }
        else {
            System.out.println("TEST FAILED");
        }
        driver.close();
    }
}
