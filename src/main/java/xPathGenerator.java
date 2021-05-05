import org.jsoup.nodes.Element;

public class xPathGenerator {


    public String generateXpathBasedOnIdWithoutNode(Element element) {
        String xpath = "//*[@id='" + element.attr("id") + "']";
        return xpath;
    }

    public String generateXpathBasedOnId(Element element) {
        String xpath = "//" + element.nodeName() + "[@id='" + element.attr("id") + "']";
        return xpath;
    }

    public String generateXpathBasedOnClass(Element element) {
        String xpath = "//" + element.nodeName() + "[@class='" + element.attr("class") + "']";
        return xpath;
    }

    public String generateXpathBasedOnClassWithoutNode(Element element) {
        String xpath = "//*[@class='" + element.attr("class") + "']";
        return xpath;
    }


    public String generateXpathBasedOnNameWithoutNode(Element element) {
        String xpath = "//*[@name='"+ element.attr("name")+"']";
        return xpath;
    }

    public String generateXpathBasedOnName(Element element) {
        String xpath = "//" + element.nodeName() + "[@name='" + element.attr("name") +"']";
        return xpath;
    }










    public String generateAbsolutePath(Element element) {

        String path =element.nodeName();

        String finalParent = "html";
        Boolean hasParent = true;
        while (hasParent) {
            if (element.hasParent()) {
                element = element.parent();

                if(element.nodeName().equals(finalParent)) {
                    path = element.nodeName() + "/" + path;
                    break;
                }else
                {
                    path = element.nodeName() + "/" + path;
                }

            } else {
                hasParent = false;
            }
        }

        return path;

    }
}
