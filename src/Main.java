import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) {
        System.setProperty("ChomreDriver.driver","c:/chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://webdriveruniversity.com/");
        driver.findElement(By.xpath("//*[@id=\"contact-us\"]/div/div[1]/h1")).click();

    // Handle Multiple Tabs

        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles()); // for new tab
        driver.switchTo().window(newTab.get(1));

    // Implicit Wait - is used to tell the web driver to wait for a certain amount of time before
    // it throws a “No Such Element Exception”.

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]")).sendKeys("ABC");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]")).sendKeys("XYZ");
        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("message")).sendKeys("abcdef");


    // Explicit waits - is used to tell the Web Driver to wait for certain conditions
    // (Expected Conditions) or maximum time exceeded before throwing “ElementNotVisibleException” exception

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement submitlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form_buttons\"]/input[2]")));
        driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]")).click();

    // Verify webpage title

        String actualTitle = driver.getTitle();
        String expectedTitle = "gianni Bruno - Designer";
        if(actualTitle.equalsIgnoreCase(expectedTitle)) // Ignore Case
            System.out.println("Title Matched");
        else
            System.out.println("Title didn't match");

// verify page text content

        String ExpectedPageContent = "Thank You for your Message!";
        String PageText= driver.findElement(By.xpath("//*[@id=\"contact_reply\"]/h1")).getText();
        if (ExpectedPageContent.equalsIgnoreCase(PageText))
            System.out.println("Page Content is correct");
        else
            System.out.println("Page content is incorrect");
    }}
