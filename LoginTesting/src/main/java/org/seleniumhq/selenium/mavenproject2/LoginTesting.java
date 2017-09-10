
package org.seleniumhq.selenium.mavenproject2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class LoginTesting {
    
    private static WebDriver driver, driver2, driver3 = null;
    
    private static WebElement element1, element2, element3, element4 = null;
    
    public static void main(String[] args) {
        initializeDriver();
        //facebookLogin();
        searchGoogle();
    }
    
    public static void initializeDriver() { //Ths computer runs on GoogleChrome
        System.setProperty("webdriver.chrome.driver", 
            "C:\\Users\\Tang Her\\Desktop\\chromedriver.exe");
    }
    
    public static void facebookLogin() {
        driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        
        element1 = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        element1.sendKeys("testing@testing.com");
        
        element2 = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        element2.sendKeys("testing");
        
        driver.findElement(By.xpath("//*[@id=\"u_0_0\"]")).click();
    }
    
    public static void searchGoogle() {
        driver2 = new ChromeDriver();
        driver2.get("http://www.google.com");
        
        element3 = driver2.findElement(By.name("q"));
        element3.sendKeys("Cheese");
        element3.submit();
        
        
        driver2.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[2]/div/div/h3/a")).click();
        driver2.findElement(By.xpath("//*[@id=\"top\"]/div[2]/h3/a")).click();
        driver2.findElement(By.xpath("//*[@id=\"PnMidLf\"]/div[3]/form/input[1]")).sendKeys("Mozzarella");
        driver2.findElement(By.xpath("//*[@id=\"PnMidLf\"]/div[3]/form/input[2]")).click();
        driver2.findElement(By.xpath("//*[@id=\"PnMidMn\"]/div[3]/div[1]/div[1]/h3/a")).click();
        
    }
}
