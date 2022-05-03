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
    public void MLExercise1() throws InterruptedException {
        pom.visit("https://www.mercadolibre.com.uy/");
        pom.MLexercise1();
    }
    @Test
    public void MLExercise2(){
        pom.visit("https://www.mercadolibre.com.uy/");
        pom.MLexercise2();

    }
  /// @Test
  ///  public void Exercise3() throws InterruptedException {
  ///      pom.visit("https://www.pedidosya.com/");
  ///      pom.PYexercise3();

  ///  }
    @AfterTest
    void teardown(){
        pom.teardown();
    }
}
