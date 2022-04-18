import org.testng.annotations.*;

public class TestNG_E1 {



    @BeforeClass
    void beforeclass(){
        System.out.println("Before Class Method");
    }


    @BeforeMethod
    void befortest(){
        System.out.println("Before Test Method");

    }
    @Test
    void test1(){
        System.out.println("Test 1 Method");
    }


    @AfterMethod
    void aftertest(){
        System.out.println("After Test Method");
    }


    @AfterClass
    void afterclass(){
        System.out.println("After class method");
    }






}
