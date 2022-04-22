import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM extends BasePOM {

   By binputText = By.name("q");
   By bsearchBTN = By.id("search_icon");
   By bresults = By.xpath("//*[@id='b_tween']/span[1]");
   By yinputText = By.id("ybar-sbq");
   By ysearchBTN = By.id("ybar-search");
   By yresults = By.xpath("//*[@id='cols']/ol/li/div/div/div/span");
   By ginputText = By.name("q");
   By gsearchbtn = By.name("btnK");
   By gresults = By.id("result-stats");
   By MLOfertas = By.linkText("Ofertas");
   By MLproductname = By.xpath("//*[@id='root-app']/div/section[2]/div/div[2]/div/ol/li[1]/a/div/div/p");
   By MLpercent = By.xpath("//*[@id='root-app']/div/section[2]/div/div[2]/div/ol/li[1]/a/div/div/div[2]/div/span");
   By MLprice = By.xpath("//*[@id='root-app']/div/section[2]/div/div[2]/div/ol/li[1]/a/div/div/div[2]/span/span");
   By MLproduct = By.partialLinkText("Lavasecarropas automático Greenwind GWLS8K-INV");

   public POM(WebDriver driver) {
      super(driver);
   }

   public void Bingsearch(String a) throws InterruptedException {
      type(a,binputText);
      if (isDisplayed(bsearchBTN)) {
         click(bsearchBTN);
         Thread.sleep(5000);
         if (isDisplayed(bresults)) {
            System.out.println("Bing finds "+ getText(bresults));
         } else {
            System.out.println("the search fail");
         }
      }
   }

      public void yahoosearch(String a) throws InterruptedException {
         type(a,yinputText);
         if (isDisplayed(ysearchBTN)) {
            click(ysearchBTN);
            Thread.sleep(5000);
            if (isDisplayed(yresults)) {
               System.out.println("Yahoo finds "+ getText(yresults));
            } else {
               System.out.println("the search fail");
            }
         }
      }

      public void googlesearch(String something) throws InterruptedException {
      type(something,ginputText);
      if(isDisplayed(gsearchbtn)){
         click(gsearchbtn);
         Thread.sleep(5000);
         if(isDisplayed(gresults)){
            System.out.println(getText(gresults));
         }else{
            System.out.println("the search fail");
         }
      }
      }
   public void MLsearch(){
      click(MLOfertas);
      String productname = getText(MLproductname);
      System.out.println(productname);
      String percent = getText(MLpercent);
      System.out.println(percent);
      String price = getText(MLprice);
      System.out.println(price);





   }



}