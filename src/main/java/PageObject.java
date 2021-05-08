import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Scanner;


public class PageObject {


    public void generateLocatorForCurrentPage() {
        System.out.println("Current URL is" + Browser.driver.getCurrentUrl());

        Scanner in = new Scanner(System.in);

        String pageDom = Browser.driver.getPageSource();


        Utils utility = new Utils();
        String pageTitle = utility.getFormattedTextName(Browser.driver.getTitle())+".json";


        JSONArray elementArray = domParser(pageDom);

        GeneratePageObjectFile file = new GeneratePageObjectFile();
        file.createPageObjectFile(elementArray,pageTitle);


    }

    public JSONArray domParser(String dom) {

        Document doc = Jsoup.parse(dom);

        xPathGenerator generator = new xPathGenerator();


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

                ElementNameGenerator nameGenerator = new ElementNameGenerator();
                if (filterHelper.checkForValidElement(element)) {

                    System.out.println("Element Node : " + element.nodeName());
                    ArrayList list = checker.getElementList(element);
                    object.put("name", nameGenerator.generateName(element));
                    object.put("absolutePath", generator.generateAbsolutePath(element));
                    object.put("xpath", list);

                    if (list.size() > 0) {
                        elementArray.add(object);
                    }
                  //  System.out.println("baseURl    " + element.cssSelector());

                }
            }


        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println(elementArray);

        return elementArray;
    }


}








