import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_E3 {
    @Test(dataProvider = "datae3")
    void test(String line){

        System.out.println(line);

    }

    @DataProvider(name="datae3")
    public Object[][] dataprovider(){
        Object[][] data = {{"FIRST TEST STRING"},{123445}};
        return data;


    }

// One test pass the other fails that's the goal in exercise 3.

}
