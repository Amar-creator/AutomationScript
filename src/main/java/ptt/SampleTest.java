package ptt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest
{
    @Test

    public void launchBrowser()
    {
        String dir=System.getProperty("user.dir");

        System.setProperty("webdriver.chrome.driver",dir+"exefiles/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("chrome launched");

    }



}
