package domParser;

import org.jsoup.nodes.Element;

public class xPathGenerator {


    public String generateXpathBasedOnIdWithoutNode(Element element) {
        String xpath = "//*[@id=" + element.attr("id") + "]";
        return xpath;
    }
    public String generateXpathBasedOnId(Element element) {
        String xpath = "//" + element.nodeName() + "[@id=" + element.attr("id") + "]";
        return xpath;
    }

    public String generateXpathBasedOnClass(Element element) {
        String xpath = "//" + element.nodeName() + "[@class=" + element.attr("class") + "]";
        return xpath;
    }

    public String generateXpathBasedOnClassWithoutNode(Element element) {
        String xpath = "//*[@class=" + element.attr("class") + "]";
        return xpath;
    }
}
