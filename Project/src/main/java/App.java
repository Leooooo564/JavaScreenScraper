import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
    public static void main(String[] args) throws IOException {
        String[] data = FileReader.scanData("../data.txt");
        String url = data[0];
        String user = data[1];
        String pw = data[2];
        

        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        System.out.println(" \n \n\\ ");


        WebElement UsernameInput = driver.findElement(By.id("username2"));
        WebElement PasswordInput = driver.findElement(By.id("inputPassword"));

        UsernameInput.sendKeys(user);
        PasswordInput.sendKeys(pw);

        WebElement LoginButton = driver.findElement(By.id("tlogin"));
        LoginButton.click();

        String currentUrl = driver.getCurrentUrl();
        new WebDriverWait(driver, 1).until(ExpectedConditions.urlChanges(url));

        WebElement tempWidgetConatiner = driver.findElement(By.cssSelector("div"));
        WebElement VPWidget = tempWidgetConatiner.findElement(By.cssSelector("a[href]"));
        VPWidget.click();
        // driver.quit();
        
    }
}