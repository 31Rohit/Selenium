import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
 @Test
   static void Setup(){
     System.setProperty("webDriver.chrome.driver","src/test/resources/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://saucedemo.com/");
     driver.findElement(By.id("user-name")).sendKeys("standerd_user");
     driver.findElement(By.id("password")).sendKeys("secret_sauce");
     driver.findElement(By.id("login-button")).click();
     driver.close();
 }

    public static void main(String[] args) {

        System.setProperty("webDriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
       WebElement firstName= driver.findElement(By.id("RESULT_TextField-1"));
       firstName.sendKeys("FirstName");
       driver.findElement(By.name("RESULT_TextField-2")).sendKeys("LastName");
       WebElement phoneNumber=driver.findElement(By.id("RESULT_TextField-3"));
        if (phoneNumber.isDisplayed() && phoneNumber.isEnabled()) {

            phoneNumber.sendKeys("1234567890")  ;}
        else
            System.out.println("Phone number field is not visible or enabled.");
       driver.findElement(By.xpath("//input[@value=Submit]")).click();

    }
}
