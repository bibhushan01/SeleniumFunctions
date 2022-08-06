import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    public static void main(String [] args){
        System.setProperty("ChromeDriver.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;

        driver.get("https://webdriveruniversity.com/Datepicker/index.html");

        driver.findElement(By.xpath("//*[@id=\"datepicker\"]/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/thead/tr/th[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/table/thead/tr/th[1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/table/thead/tr/th[1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/table/tbody/tr/td/span[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span[1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[1]/td[7]")).click();
// close

    }
}
