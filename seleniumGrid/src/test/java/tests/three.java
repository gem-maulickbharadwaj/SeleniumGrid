package tests;

import base.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class three extends Base {
    //System.("webdriver.chrome.driver","C:\\Users\\Maulick\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver;

    @Test
    public void testThree(){
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Maulick\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle()+"From Edge");
    }
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        driver=initializeBrowser("edge");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
