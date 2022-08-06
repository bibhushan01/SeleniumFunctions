import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts_Handling {

    public static void main (String [] args) throws InterruptedException {

        System.setProperty("ChromeDriver.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;

        driver.get("http://demo.guru99.com/test/delete_customer.php");

        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();

    // Switching to Alert
        Alert alert = driver.switchTo().alert();

    // Capturing alert message.
        String alertMessage= driver.switchTo().alert().getText();

    // Displaying alert message
        System.out.println(alertMessage);

        Thread.sleep(5000);

    // Accepting alert
        alert.accept();

    // To click on the ‘OK’ button of the alert.
        driver.switchTo().alert().accept();

    // To click on the ‘Cancel’ button of the alert.
        driver.switchTo().alert().dismiss();


    // To send some data to alert box.
        driver.switchTo().alert().sendKeys("Text");

    // To capture the alert message.
        driver.switchTo().alert().getText();
    }

}


