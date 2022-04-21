import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class Tests {

    private WebDriver driver;
    POM pom;



    @BeforeTest
    public void setUp() {
        pom = new POM(driver);
        driver = pom.ChromeConnection();
    }
    @Test(dataProvider = "whatyoullsearch")
    public void Googletest(String something) throws InterruptedException {
        pom.visit("https://www.google.com/");
        pom.googlesearch(something);

    }
    @Test(dataProvider = "whatyoullsearch")
    public void bingtest(String something) throws InterruptedException {
        pom.visit("https://www.bing.com/");
        pom.Bingsearch(something);

    }
    @Test(dataProvider = "whatyoullsearch")
    public void bingvsgoogletest(String something) throws InterruptedException {
        pom.visit("https://www.bing.com/");
        pom.Bingsearch(something);
        pom.visit("https://www.google.com/");
        pom.googlesearch(something);

    }
    @AfterClass
    public void after(){
        pom.teardown();
    }


    @DataProvider(name="whatyoullsearch")
    public Object[][] Somethingtosearch(){
        Object[][] Something ={{"gato"},{"humano"},{"perro"}};
        return Something;
    }


}
