import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class POM_Exercise2 {

    private WebDriver driver;
    POM pom;

    @BeforeTest
    public void setUp(){
        pom = new POM(driver);
        driver = pom.ChromeConnection();
    }
    @Test
    public void MLtest() throws InterruptedException {
        pom.visit("https://www.mercadolibre.com.uy/");
        pom.MLsearch();
    }
    @AfterTest
    void teardown(){
        pom.teardown();
    }
}
