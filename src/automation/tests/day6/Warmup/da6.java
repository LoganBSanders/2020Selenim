package day6.Warmup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utulities.DriverFactory;

public class da6 {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
       ebayTest();
        amazonTest();
        wikiTest();




    }

    public static void ebayTest() throws InterruptedException {
        driver = DriverFactory.createDriver("chrome");
        driver.get("http://ebay.com");
        driver.findElement(By.id("gh-ac")).sendKeys("java book");
        Thread.sleep(2000);
        driver.findElement(By.id("gh-btn")).click();
        WebElement searchResult = driver.findElement(By.tagName("h1"));
        System.out.println(searchResult.getText().split(" ")[0]);


        Thread.sleep(2000);
        driver.quit();
    }

    public static void amazonTest() throws InterruptedException {
        driver = DriverFactory.createDriver("chrome");
        driver.get("http://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book", Keys.ENTER);
        Thread.sleep(2000);
        String title = driver.getTitle();
        if (title.contains("java book)")){
            System.out.println("Test Passed");
        } else{
            System.out.println("Test Failed");
        }


        Thread.sleep(2000);
        driver.quit();

    }

    public static void wikiTest() throws InterruptedException {
        driver = DriverFactory.createDriver("chrome");
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.id("searchInput")).sendKeys("Selenium webdriver", Keys.ENTER);
        //driver.findElement(By.name("go")).click();
        driver.findElement(By.partialLinkText("Selenium (software)")).click();

        Thread.sleep(2000);
        String link = driver.getCurrentUrl();
        if (link.endsWith("Selenium_(software)")){
            System.out.println("Test Passed");
        } else{
            System.out.println("Test Failed");
        }


        Thread.sleep(2000);
        driver.quit();

    }


}
