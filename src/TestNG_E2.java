import org.testng.annotations.*;

public class TestNG_E2 {

    @BeforeClass
    void beforeclass(){
        System.out.println("Before Class Method");
    }


    @BeforeMethod
    void befortest(){
        System.out.println("Before Test Method");

    }
    @Test(dataProvider = "testdata")
    void test1(String line){
        System.out.println(line);
    }


    @AfterMethod
    void aftertest(){
        System.out.println("After Test Method");
    }


    @AfterClass
    void afterclass(){
        System.out.println("After class method");
    }

    @DataProvider(name="testdata")
    public Object[][] Dataprovider(){
        Object[][] data = {{"FIRST TEST STRING"},{"SECOND TEST STRING"}};
        return data;


    }


//if I use @BeforeTest instead of @BeforeMethod , the order change and the @BeforeTest appears first instead
// of @BeforeClass.



}
