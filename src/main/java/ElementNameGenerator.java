import org.jsoup.nodes.Element;

public class ElementNameGenerator {

    public String generateName(Element element) {

        ElementChecker checker = new ElementChecker();

        String name = null;

        if (element.hasText()) {
            name = element.text() + "_" + getElementTypeName(element);
        } else if (checker.checkForAttributeIsAvailable(element, "name")) {
            name = element.attr("name") + "_" + getElementTypeName(element);

        } else if (checker.checkForAttributeIsAvailable(element, "id")) {
            name = element.attr("id") + "_" + getElementTypeName(element);
        }

        return name;
    }


    public String getElementTypeName(Element element) {
        String elementType = "";
        if (element.nodeName().equals("a")) {
            elementType = "link";
        }

        if (element.nodeName().equals("input")) {
            if (element.attr("type").equals("text")) {
                elementType = "textfield";
            }
            if (element.attr("type").equals("submit")) {
                elementType = "button";
            }
            if (element.attr("type").equals("password")) {
                elementType = "passwordbox";
            }
        }
        if (element.nodeName().equals("button")) {
            elementType = "button";
        }
        return elementType;
    }

}
