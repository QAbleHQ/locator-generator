import domParser.ElementChecker;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;


public class PageObject {


    public void generateLocatorForCurrentPage() {
        System.out.println("Current URL is" + Browser.driver.getCurrentUrl());
        String pageDom = Browser.driver.getPageSource();

        domParser(pageDom);


    }

    public void domParser(String dom) {


        Document doc = Jsoup.parse(dom);
        Elements links = doc.select("a");
        Element head = doc.select("head").first();



        String currentPath = "";
        Elements allElements =
                doc.getAllElements();

        ElementChecker checker = new ElementChecker();
        JSONArray elementArray = new JSONArray();
        for (Element element : allElements) {

            if (!element.nodeName().equals("#document")) {

                JSONObject object = new JSONObject();
                //            System.out.println(currentPath);
//                System.out.println(element.nodeName()
                //                      + " " + element.ownText());

                currentPath = currentPath + "/" + element.nodeName();


                ElementFilterHelper filterHelper = new ElementFilterHelper();
                if (filterHelper.checkForValidElement(element)) {
                    object.put("name", element.nodeName());
                    object.put("absolutePath", currentPath);
                    object.put("xpath", checker.getElementList(element, currentPath));
                    elementArray.add(object);

                }
            }


        }
        System.out.println("-------------------------------------------------------------------");
          System.out.println(elementArray);

        GeneratePageObjectFile file = new GeneratePageObjectFile();
        file.createPageObjectFile(elementArray);
    }


}








