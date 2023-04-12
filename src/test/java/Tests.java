import com.google.auto.common.Visibility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Tests {


    @Test
    public void ClickAboutInSatisfice() throws InterruptedException {


        WebDriver driver = null;
        WebDriverManager.chromedriver().browserVersion("112.0.5615.50").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.satisfice.com/");

        Thread.sleep(1000);
driver.findElement(By.xpath("//span[normalize-space()='About']")).click();
        Thread.sleep(5000);
driver.quit();

        System.out.println("CLICKED ABOUT, TEST PASS");

    }

    @Test
    public void ClickMethodologyInSatisfice() throws InterruptedException {


        WebDriver driver = null;
        WebDriverManager.chromedriver().browserVersion("112.0.5615.50").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.satisfice.com/");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Methodology']")).click();
        Thread.sleep(5000);
        driver.quit();

        System.out.println("CLICKED METHODOLOGY, TEST PASS");

    }

    @Test
    public void ClickConsultingInSatisfice() throws InterruptedException {


        WebDriver driver = null;
        WebDriverManager.chromedriver().browserVersion("112.0.5615.50").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.satisfice.com/");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Consulting']")).click();
        Thread.sleep(5000);
        driver.quit();

        System.out.println("CLICKED CONSULTING, TEST PASS");

    }



}
