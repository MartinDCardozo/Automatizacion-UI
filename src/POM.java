import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;

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
   By MLprice = By.xpath("//*[@id='root-app']/div/section[2]/div/div[2]/div/ol/li[1]/a/div/div/div[2]/span");
   By MLproduct = By.xpath("//*[@id='root-app']/div/section[2]/div/div[2]/div/ol/li[1]/a");
   By MLproductname1 = By.xpath("//*[@id='root-app']/div/div[4]/div/div[1]/div/div[1]/div/div[1]/div/div[2]/h1");
   By MLpercent1 = By.xpath("//*[@id='root-app']/div/div[4]/div/div[1]/div/div[1]/div/div[3]/div/div[1]/span[2]/span");
   By MLprice1 = By.xpath("//*[@id='root-app']/div/div[4]/div/div[1]/div/div[1]/div/div[3]/div/div[1]/span[1]/span[3]");
   By MLpriceus1 = By.xpath("//*[@id='root-app']/div/div[4]/div/div[1]/div/div[1]/div/div[3]/div/div[1]/span[1]/span[2]");
   By MLmejorestiendas2doE = By.xpath("//*[@id='view-more']");
   By MLtienda = By.xpath("//*[@id='root-app']/div/div/section[9]/div/div[2]/div/div[1]/div/div[2]/div");
   By MLpagename = By.xpath("//*[@id='root-app']/div/div[2]/aside/div[1]/h1");
   By PYuruguay = By.xpath("//*[@id='country_list']/div/div[14]/div/a");
   By PYsearchbtn = By.id("location_search_btn");
   By PYadressinput = By.id("search_address_input");
   By PYpopup = By.id("confirm_location_btn");
   By PYplace = By.xpath("//*[@id='app']/div/div[2]/div[2]/div/div[1]/div[5]/a[1]");
   By PYerror = By.id("error__container__action");
   By PYhold =By.id("ISSyKzSlUpSmnql");


   public POM(WebDriver driver) {
      super(driver);
   }

   public void Bingsearch(String a) throws InterruptedException {
      type(a, binputText);
      if (isDisplayed(bsearchBTN)) {
         click(bsearchBTN);
         Thread.sleep(5000);
         if (isDisplayed(bresults)) {
            System.out.println("Bing finds " + getText(bresults));
         } else {
            System.out.println("the search fail");
         }
      }
   }

   public void yahoosearch(String a) throws InterruptedException {
      type(a, yinputText);
      if (isDisplayed(ysearchBTN)) {
         click(ysearchBTN);
         Thread.sleep(5000);
         if (isDisplayed(yresults)) {
            System.out.println("Yahoo finds " + getText(yresults));
         } else {
            System.out.println("the search fail");
         }
      }
   }

   public void googlesearch(String something) throws InterruptedException {
      type(something, ginputText);
      if (isDisplayed(gsearchbtn)) {
         click(gsearchbtn);
         Thread.sleep(5000);
         if (isDisplayed(gresults)) {
            System.out.println(getText(gresults));
         } else {
            System.out.println("the search fail");
         }
      }
   }

   public void MLexercise1() {
      click(MLOfertas);
      String productname = getText(MLproductname);
      String percent = getText(MLpercent);
      String price = getText(MLprice);
      if(isDisplayed(MLproduct)){
         String href = gethref(MLproduct);
         visit(href);
      }
      if(productname.equals(getText(MLproductname1))){
         System.out.println("Name match");
      }
      if(percent.equals(getText(MLpercent1))){
         System.out.println("Percent match");
      }
      String fullprice = getText(MLpriceus1) + getText(MLprice1);
      String newprice = price.replaceAll("\\s", "");
      if (newprice.equals(fullprice)){
         System.out.println("Price match");
      }

   }

   public void MLexercise2() {
      String vertiendas = gethref(MLmejorestiendas2doE);
      visit(vertiendas);
      if (currenturl().equals(vertiendas)) {
         System.out.println("match");
      } else {
         System.out.println("error");
      }
   }

 ///  public void PYexercise3() throws InterruptedException {
  ///    move(PYuruguay);
 ///     click(PYuruguay);
 ///     Thread.sleep(5000);
 ///  } THE PEDIDOSYA WEBSITE HAS BEEN UPDATED AND IS NO LONGER VIABLE FOR USE AUTOMATED SOFTWARE ON IT
   ///  , THE MOMENT THE WEBDRIVER TAKES CONTROL THE PAGE LEADES YOU TO A KIND OF CAPTCHA FOR PREVENT DE USE OF
   /// AUTOMATED SOFTWARE . IN SEVERAL ATTEMPTS IF THE SCRIPT PASS THE COUNTRY SELECTION , GETS STUCK RIGHT AFTER THAT.
}