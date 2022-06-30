import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.List;

public class BasePOM {

    private WebDriver driver;

    public BasePOM(WebDriver driver){
        this.driver = driver;
    }
    public WebDriver ChromeConnection(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tinch\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }



    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }
    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }
    public String getText(WebElement element){
        return element.getText();
    }
    public String getText(By locator){
        return driver.findElement(locator).getText();
    }
    public void type(String inputText,By locator){
        driver.findElement(locator).sendKeys(inputText);
    }
    public void click(By locator){
        driver.findElement(locator).click();
    }
    public boolean isDisplayed(By locator){
        try{
            return driver.findElement(locator).isDisplayed();
    }catch(org.openqa.selenium.NoSuchElementException e){
        return false;
        }
    }
    public void teardown(){
        driver.quit();
    }
    public void visit(String url){
        driver.get(url);
    }
    public String gethref(By locator){return driver.findElement(locator).getAttribute("href");}
    public String currenturl(){return driver.getCurrentUrl();}
    public String getsrc(By locator){return driver.findElement(locator).getAttribute("src");}
    public void move(By locator){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(locator));
    }





}
