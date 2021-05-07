import org.jsoup.nodes.Element;

import java.util.Locale;

public class ElementNameGenerator {

    public String generateName(Element element) {


        String name = "unknown_element";


        if (element.nodeName().equals("input")) {
            name = getNameForInputBox(element);
        }

        if (element.nodeName().equals("link")) {

        }

        if (element.nodeName().equals("textarea")) {
             name = getNameForTextArea(element);
        }


        if (element.nodeName().equals("button")) {
             name = getNameForButton(element);
        }


        return name;
    }


    public String getNameForInputBox(Element element) {

        ElementChecker checker = new ElementChecker();
        String name = "";
        String elementType = "";
        if (element.nodeName().equals("input")) {
            if (element.attr("type").equals("text")) {
                elementType = "text_field";
            }
            if (element.attr("type").equals("submit")) {
                elementType = "button";
            }
            if (element.attr("type").equals("password")) {
                elementType = "password_box";
            }
            if (element.attr("type").equals("file")) {
                elementType = "upload_box";
            }
            if (element.attr("type").equals("email")) {
                elementType = "email_field";
            }



        }


        if (element.hasText()) {
            name = getFormattedTextName(element.text()) + "_" + elementType;
        } else if (checker.checkForAttributeIsAvailable(element, "placeholder")) {
            name = getFormattedTextName(element.attr("placeholder")) + "_" + elementType;
        } else if (checker.checkForAttributeIsAvailable(element, "value") && !getFormattedTextName(element.attr("value")).equals("")) {
            name = getFormattedTextName(element.attr("value")) + "_" + elementType;
        } else if (checker.checkForAttributeIsAvailable(element, "name")) {
            name = getFormattedTextName(element.attr("name")) + "_" + elementType;

        } else if (checker.checkForAttributeIsAvailable(element, "id")) {
            name = getFormattedTextName(element.attr("id")) + "_" + elementType;
            System.out.println(name);
        } else {
            Element element1 = element.parent().siblingElements().first();

            if (element1.nodeName().equals("label")) {
                name = getFormattedTextName(element1.text()) + "_" + elementType;
            }
            name = "unknown_element";
        }


        return name;
    }

    public String getNameForButton(Element element) {

        ElementChecker checker = new ElementChecker();
        String name = "";
        String elementType = "button";
        if (element.nodeName().equals("button")) {
            if (element.attr("type").equals("button")) {
            //    elementType = "textField";
            }


        }


        if (element.hasText()) {
            name = getFormattedTextName(element.text()) + "_" + elementType;
        } else if (checker.checkForAttributeIsAvailable(element, "placeholder")) {
            name = getFormattedTextName(element.attr("placeholder")) + "_" + elementType;
        } else if (checker.checkForAttributeIsAvailable(element, "value") && !getFormattedTextName(element.attr("value")).equals("")) {
            name = getFormattedTextName(element.attr("value")) + "_" + elementType;
        } else if (checker.checkForAttributeIsAvailable(element, "name")) {
            name = getFormattedTextName(element.attr("name")) + "_" + elementType;

        } else if (checker.checkForAttributeIsAvailable(element, "id")) {
            name = getFormattedTextName(element.attr("id")) + "_" + elementType;
            System.out.println(name);
        } else {
            Element element1 = element.parent().siblingElements().first();
            if (element1.nodeName().equals("label")) {
                name = getFormattedTextName(element1.text()) + "_" + elementType;
            }
            name = "unknown_element";
        }


        return name;
    }


    public String getNameForTextArea(Element element) {

        ElementChecker checker = new ElementChecker();
        String name = "";
        String elementType = "textarea";
        if (element.nodeName().equals("textarea")) {
            if (element.attr("type").equals("textarea")) {
                //    elementType = "textField";
            }


        }


        if (element.hasText()) {
            name = getFormattedTextName(element.text()) + "_" + elementType;
        } else if (checker.checkForAttributeIsAvailable(element, "placeholder")) {
            name = getFormattedTextName(element.attr("placeholder")) + "_" + elementType;
        } else if (checker.checkForAttributeIsAvailable(element, "value") && !getFormattedTextName(element.attr("value")).equals("")) {
            name = getFormattedTextName(element.attr("value")) + "_" + elementType;
        } else if (checker.checkForAttributeIsAvailable(element, "name")) {
            name = getFormattedTextName(element.attr("name")) + "_" + elementType;

        } else if (checker.checkForAttributeIsAvailable(element, "id")) {
            name = getFormattedTextName(element.attr("id")) + "_" + elementType;
            System.out.println(name);
        } else {
            Element element1 = element.parent().siblingElements().first();
            if (element1.nodeName().equals("label")) {
                name = getFormattedTextName(element1.text()) + "_" + elementType;
            }
            name = "unknown_element";
        }


        return name;
    }



    public String getFormattedTextName(String name) {

        String formattedTextName = name.replace(" ", "_").toLowerCase(Locale.ROOT);

        return formattedTextName;
    }



}
