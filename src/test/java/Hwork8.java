import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hwork8 {
    private static WebDriver driverChrome;
    private static WebDriver driverFirefox;

    @BeforeClass
    public void ChromeFirefox(){
        System.setProperty("webdriver.chrome.driver",DriversHwork.CHROMEDRIVER_PATH);
        driverChrome = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver",DriversHwork.FIREFOXDRIVER_PATH);
        driverFirefox = new FirefoxDriver();
    }




    @Test
    public void T1_openChrome(){
        driverChrome.get("https://www.walla.co.il/");
    }


    @Test
    public void T2_openFirefox(){
        driverFirefox.get("https://www.ynet.co.il/");
    }

    @Test
    public void T3_ChromeGtranslate(){
        driverChrome.get("https://translate.google.co.il/");
        System.out.println(driverChrome.findElement(By.tagName("textarea")));
        System.out.println(driverChrome.findElement(By.className("er8xn")));

    }

    @Test
    public void T4_FirefoxUtube(){
        driverFirefox.get("https://www.youtube.com/");
        System.out.println(driverFirefox.findElement(By.id("logo-icon")));
    }

//    @Test
//    public void T5_FirefoxSelenium(){
//        driverFirefox.get("http://www.seleniumhq.org/");
//        WebElement findElementName = driverFirefox.findElement(By.ByName());
//        System.out.println(findElementName);
//        findElementName.sendKeys("selenium");
//    }

    @Test
    public void T6_ChromeAmazon(){
        driverChrome.get("https://www.amazon.com/");
        driverChrome.findElement(By.id("twotabsearchtextbox")).sendKeys("Leather shoes");

    }

    @Test
    public void T7_TranslateHebrew(){
        driverChrome.get("https://translate.google.co.il/");
        driverChrome.findElement(By.className("er8xn")).sendKeys("בסדר");

    }

    @Test
    public void T8_YtubeSong(){
        driverChrome.get("https://www.youtube.com/");
        driverChrome.findElement(By.name("search_query")).sendKeys("Scorpions");
        driverChrome.findElement(By.id("search-icon-legacy")).click();
    }

    @Test
    public void T9_ChromeFacebook(){
        driverChrome.get("https://www.facebook.com/");
        driverChrome.findElement(By.id("email")).sendKeys("Serzh");
        driverChrome.findElement(By.id("pass")).sendKeys("Serzh");
    }
    @AfterClass
    public static void Finish(){
        System.out.println("Finish");
    }

}

