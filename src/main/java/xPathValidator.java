import org.openqa.selenium.By;

public class xPathValidator {


    public boolean isxPathIsVisible(String xPath) {
        boolean isVisible = false;
        if (Browser.driver.findElement(By.xpath(xPath)).isDisplayed()) {
            isVisible = true;
        }

        return isVisible;
    }


}
