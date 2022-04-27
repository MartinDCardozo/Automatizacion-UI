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
   By MLproduct = By.xpath("//*[@id='root-app']/div/section[2]/div/div[2]/div/ol/li[1]/a");
   By MLproductname1 = By.xpath("//*[@id='root-app']/div/div[4]/div/div[1]/div/div[1]/div/div[1]/div/div[2]/h1");
   By MLpercent1 = By.xpath("//*[@id='root-app']/div/div[4]/div/div[1]/div/div[1]/div/div[2]/div/div[1]/div/span[2]/span");
   By MLprice1 = By.xpath("//*[@id='root-app']/div/div[4]/div/div[1]/div/div[1]/div/div[2]/div/div[1]/div/span[1]/span[3]");
   By MLpriceus1 = By.xpath("//*[@id='root-app']/div/div[4]/div/div[1]/div/div[1]/div/div[2]/div/div[1]/div/span[1]/span[2]");



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

   public void MLsearch() throws InterruptedException {
      click(MLOfertas);
      String productname = getText(MLproductname);
      String percent = getText(MLpercent);
      String price = getText(MLprice);
      if (isDisplayed(MLproduct)) {
         String href = gethref(MLproduct);
         visit(href);
      }
      if (productname.equals(getText(MLproductname1))) {
         System.out.println("Name match");
      }else {
         System.out.println("error");
      }if(percent.equals(getText(MLpercent1))){
         System.out.println("Percent match");
      }else {
         System.out.println("error");
      }
      String fullprice = getText(MLpriceus1)+getText(MLprice1);
      String newprice = price.replaceAll("\\s", "");
      if(newprice.equals(fullprice)){
         System.out.println("Price match");
      }else{
         System.out.println("error");
      }

      }


   }
