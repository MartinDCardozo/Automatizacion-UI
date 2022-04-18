import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class Tests {


    Object path = System.setProperty("webdriver.chrome.driver", "C:\\Users\\tinch\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
    WebDriver driver;


    @Test(dataProvider = "something")
    void Ejercicio1(String something) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys(something);
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.name("btnK")).click();
        TimeUnit.SECONDS.sleep(2);
        WebElement results=driver.findElement(By.id("result-stats"));
        Assert.assertTrue(results.isDisplayed());
        Thread.sleep(5000);
        driver.close();



    }

    @Test(dataProvider = "something")
    void Ejercicio2(String something) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.bing.com/");
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.name("q")).sendKeys(something);
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id("search_icon")).click();
        TimeUnit.SECONDS.sleep(3);
        WebElement results=driver.findElement(By.className("sb_count"));
        Assert.assertTrue(results.isDisplayed());
        Thread.sleep(6000);
        driver.close();



    }
    @Test(dataProvider = "something")
    void Ejercicio3(String something) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys(something);
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.name("btnK")).click();
        TimeUnit.SECONDS.sleep(2);
        String gresults=driver.findElement(By.id("result-stats")).getText();
        driver.get("https://www.bing.com/");
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.name("q")).sendKeys(something);
        driver.findElement(By.id("search_icon")).click();
        TimeUnit.SECONDS.sleep(2);
        String bresutls=driver.findElement(By.xpath("//*[@id='b_tween']/span[1]")).getText();
        System.out.println("La busqueda fue exitosa:\n" +
                "los resultados de google son: "+gresults+"\n"+
                "los resultados de bing son: "+bresutls);
        TimeUnit.SECONDS.sleep(3);
        driver.close();





    }
    @AfterClass
    void end(){
        driver.quit();
    }


    @DataProvider(name="something")
    public Object[][] Somethingtosearch(){
        Object[][] Something ={{"gato"},{"humano"},{"perro"}};
        return Something;

    }


}
