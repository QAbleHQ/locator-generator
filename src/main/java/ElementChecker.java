import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.ArrayList;

public class ElementChecker {

    public ArrayList getElementList(Element element) {
        xPathGenerator generator = new xPathGenerator();
        xPathValidator validator = new xPathValidator();
        ArrayList list = new ArrayList();
        if (checkForAttributeIsAvailable(element, "id")) {

            if (validator.isxPathIsVisible(generator.generateXpathBasedOnId(element))) {
                list.add(generator.generateXpathBasedOnId(element));
            }

            if (validator.isxPathIsVisible(generator.generateXpathBasedOnIdWithoutNode(element))) {
                list.add(generator.generateXpathBasedOnIdWithoutNode(element));
            }

        }else
        if (checkForAttributeIsAvailable(element, "class")) {

            if (validator.isxPathIsVisible(generator.generateXpathBasedOnClass(element))) {
                list.add(generator.generateXpathBasedOnClass(element));
            }

            if (validator.isxPathIsVisible(generator.generateXpathBasedOnClassWithoutNode(element))) {
                list.add(generator.generateXpathBasedOnClassWithoutNode(element));
            }

        } else

        if (checkForAttributeIsAvailable(element, "name")) {

            if (validator.isxPathIsVisible(generator.generateXpathBasedOnNameWithoutNode(element))) {
                list.add(generator.generateXpathBasedOnClass(element));
            }

            if (validator.isxPathIsVisible(generator.generateXpathBasedOnName(element))) {
                list.add(generator.generateXpathBasedOnClassWithoutNode(element));
            }

        }


        return list;
    }


    public boolean checkForAttributeIsAvailable(Element element, String attributeName) {
        System.out.println("Attributes   " + element.attributes());

        Attributes attributes = element.attributes();

        boolean bool = false;
        for (Attribute a : attributes.asList()) {
            if (a.getKey().equals(attributeName)) {
                bool = true;
                break;
            }
        }

        return bool;
    }


}
