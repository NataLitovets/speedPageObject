import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage{

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void navigate() {
        driver.get("https://eatstreet.com/signin");
    }

    public WebElement getEmailField() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement getLoginBtn() {
        return driver.findElement(By.xpath("//button[@id='signin']"));
    }
    public WebElement getErorrMessage() {
        return driver.findElement(By.xpath("//span[contains(text(),'is incorrect')]"));
    }

    public void closeModal() {
 driver.findElement(By.xpath("//button[contains(text(),'Got it')]")).click();
    }
}
