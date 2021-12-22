import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class EntryPoint {

   public static String website = "";
    public static String pageObjectDirectory = "";


    public void generate_locators(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Hello Welcome to the locator generator");

        System.out.println("First tell me the Directory Where you wanted to generate pageObject");

        EntryPoint.pageObjectDirectory = in.nextLine();


        System.out.println("Tell me the Website Entry Point : ");
        EntryPoint entry = new EntryPoint();
        Browser browser = new Browser();

        entry.website = in.nextLine();
        System.out.println("Okey, Now we are opening the page: " + entry.website);
        browser.openBrowser();

        entry.waitForCommand();


    }








    public void waitForCommand() {
        System.out.println("When you are ready - Type : generate.");

        Scanner commandIn = new Scanner(System.in);
        String command = commandIn.nextLine();

        if (command.equals("generate")) {
            generate();
        } else
        {
            System.out.println("Sorry, It's out of my limit, Please try : generate");
            waitForCommand();
        }




    }

    public void generate()
    {
        System.out.println("generate triggered");
        PageObject object = new PageObject();
        object.generateLocatorForCurrentPage();
        waitForCommand();

    }

}
