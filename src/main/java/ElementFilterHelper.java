import org.json.simple.JSONObject;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;

public class ElementFilterHelper {

    public boolean checkForValidElement(Element element) {
        boolean isValidElement = false;

        if (checkForButton(element) | checkForLink(element) | checkForTextarea(element) | checkForInput(element)) {
            isValidElement = true;

        }
        return isValidElement;
    }

    public Boolean checkForButton(Element element) {
        Boolean bool = false;

        if (element.nodeName().equals("button")) {
            bool = true;
        }
        return bool;
    }

    public Boolean checkForLink(Element element) {
        Boolean bool = false;

        if (element.nodeName().equals("a")) {
            bool = true;
        }
        return bool;
    }

    public Boolean checkForInput(Element element) {
        Boolean bool = false;

        if (element.nodeName().equals("input")) {
            bool = true;
        }
        return bool;
    }

    public Boolean checkForSelect(Element element) {
        Boolean bool = false;

        if (element.nodeName().equals("Select")) {
            bool = true;
        }
        return bool;
    }

    public Boolean checkForTextarea(Element element) {
        Boolean bool = false;

        if (element.nodeName().equals("textarea")) {
            bool = true;
        }
        return bool;
    }


}
