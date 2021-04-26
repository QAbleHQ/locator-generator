public class PageObject {



   public void generateLocatorForCurrentPage()
   {
       System.out.println("Current URL is" + Browser.driver.getCurrentUrl());
       String pageDom = Browser.driver.getPageSource();
       System.out.println(pageDom);




   }




}
