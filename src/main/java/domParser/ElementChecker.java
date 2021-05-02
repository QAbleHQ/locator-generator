package domParser;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.ArrayList;

public class ElementChecker {

    public ArrayList getElementList(Element element, String currentPath) {
        xPathGenerator generator = new xPathGenerator();
        ArrayList list = new ArrayList();
        if (checkForID(element)) {
            list.add(generator.generateXpathBasedOnId(element));
            list.add(generator.generateXpathBasedOnIdWithoutNode(element));
        }
        if (checkForClass(element))
        {
            list.add(generator.generateXpathBasedOnClass(element));
            list.add(generator.generateXpathBasedOnClassWithoutNode(element));

        }

   return list;
    }



    public boolean checkForID(Element element) {
        System.out.println("Attributes   " + element.attributes());

        Attributes attributes = element.attributes();

        boolean bool = false;
        for (Attribute a : attributes.asList()) {
            if (a.getKey().equals("id")) {
                bool = true;
                break;
            }
        }


        return bool;
    }

    public boolean checkForClass(Element element) {
        System.out.println("Attributes   " + element.attributes());

        Attributes attributes = element.attributes();

        boolean bool = false;
        for (Attribute a : attributes.asList()) {
            if (a.getKey().equals("class")) {
                bool = true;
                break;
            }
        }


        return bool;
    }


}
