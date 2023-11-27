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

        try {
            System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get(url);
            System.out.println(" \n \n\\ ");

            login(driver, url, user, pw);

            new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#sortablestart")));
            String currentPage = driver.getCurrentUrl();
            driver.get(currentPage);
            System.out.println(" \n \n\\ ");
            
            WebElement tempWidgetConatiner = driver.findElement(By.cssSelector("#accordion"));
            WebElement VPWidget = tempWidgetConatiner.findElement(By.cssSelector("div:nth-child(3) > div.panel-body > ul > li.ui-state-default.t17-1 > div > div.logobox > div.logoview > a"));
            String href = VPWidget.getAttribute("href");

            driver.get(href);

            getDaten(driver);
            
            // driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void login(WebDriver driver,String url, String user, String pw) {
            WebElement UsernameInput = driver.findElement(By.id("username2"));
            WebElement PasswordInput = driver.findElement(By.id("inputPassword"));

            UsernameInput.sendKeys(user);
            PasswordInput.sendKeys(pw);

            WebElement LoginButton = driver.findElement(By.id("tlogin"));
            LoginButton.click();
    }

    public static void getDaten(WebDriver driver) {
        WebElement DayListCon = driver.findElement(By.cssSelector("#content > div.row.clearfix"));
        WebElement heuteDiv = DayListCon.findElement(By.className("panel-primary"));

        check(heuteDiv);
        System.out.println(heuteDiv.getAttribute("id"));

        for (WebElement Day : DayListCon.findElements(By.cssSelector("div.panel-info[style=\"display: none;\"]"))) {
            System.out.println(Day.getAttribute("id"));
            check(Day);
        }
    }

    public static void check(WebElement heuteDiv) {
        WebElement table = heuteDiv.findElement(By.className("table.table-hover.table-condensed.table-striped"));
    }
}