import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class POM_Exercise1 {

    private WebDriver driver;
    POM pom;

    @BeforeTest
    public void setUp(){
        pom = new POM(driver);
        driver = pom.ChromeConnection();
    }
    @AfterClass
    public void after(){
        pom.teardown();
    }

    @Test
    public void bingvsyahootest() throws InterruptedException {
        pom.visit("https://www.bing.com/");
        pom.Bingsearch("perro");
        pom.visit("https://espanol.yahoo.com/?p=us");
        pom.yahoosearch("perro");
    }


}
