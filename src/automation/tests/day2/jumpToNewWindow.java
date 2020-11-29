package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class jumpToNewWindow {
    public static void main(String[] args) throws Exception {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        driver.get("http:practice.cybertekschool.com/open_new_tab");

        Thread.sleep(5000);

        String windowHandle = driver.getWindowHandle();

        System.out.println(windowHandle);

        Set<String> windowHandles =driver.getWindowHandles();

        System.out.println(windowHandles);
        System.out.println("Before Switch: " + driver.getCurrentUrl());

        for (String windowsId: windowHandles) {

            if (!windowsId.equals(windowHandle)){
                driver.switchTo().window(windowsId);
            }

        }

        System.out.println("After Switch: " + driver.getCurrentUrl());
        driver.close();








    }
}
