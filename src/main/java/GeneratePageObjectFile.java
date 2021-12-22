import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GeneratePageObjectFile {

    private static String jsonSting = "{\n" +
            "  \"search_text_box\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"text_box\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//input[@name='q']\",\n" +
            "      \"html/body/div/div/form/div/div/div/div/div/input\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"বাংলা_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'বাংলা')]\",\n" +
            "      \"html/body/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"settings_button\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"button\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//button[contains(text(),'Settings')]\",\n" +
            "      \"html/body/div/div/div/div/div/button\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"తెలుగు_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'తెలుగు')]\",\n" +
            "      \"html/body/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"ಕನ್ನಡ_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'ಕನ್ನಡ')]\",\n" +
            "      \"html/body/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"search_help_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'Search help')]\",\n" +
            "      \"html/body/div/div/div/div/div/ul/li/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"how_search_works_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'How Search works')]\",\n" +
            "      \"html/body/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"മലയാളം_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'മലയാളം')]\",\n" +
            "      \"html/body/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"terms_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'Terms')]\",\n" +
            "      \"html/body/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"advertising_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'Advertising')]\",\n" +
            "      \"html/body/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"your_data_in_search_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'Your data in Search')]\",\n" +
            "      \"html/body/div/div/div/div/div/ul/li/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"தமிழ்_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'தமிழ்')]\",\n" +
            "      \"html/body/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"gmail_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'Gmail')]\",\n" +
            "      \"html/body/div/div/div/div/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"business_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'Business')]\",\n" +
            "      \"html/body/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"s_ncydrdj9akr7wpzuuosak_text_box\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"text_box\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"html/body/div/div/form/div/input\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"send_feedback_button\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"button\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//button[contains(text(),'Send feedback')]\",\n" +
            "      \"html/body/div/div/div/div/div/ul/li/button\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"search_settings_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'Search settings')]\",\n" +
            "      \"html/body/div/div/div/div/div/ul/li/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"report_inappropriate_predictions_button\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"button\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'Report inappropriate predictions')]\",\n" +
            "      \"html/body/div/div/form/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"google_apps_button\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"button\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[@aria-label='Google apps']\",\n" +
            "      \"html/body/div/div/div/div/div/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"मराठी_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'मराठी')]\",\n" +
            "      \"html/body/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"advanced_search_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'Advanced search')]\",\n" +
            "      \"html/body/div/div/div/div/div/ul/li/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"csi_textarea\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"textarea\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"html/body/textarea\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"privacy_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'Privacy')]\",\n" +
            "      \"html/body/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"about_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'About')]\",\n" +
            "      \"html/body/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"hp_text_box\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"text_box\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"html/body/div/div/form/div/input\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"als-wamaaaaaycmhw0raliddhrsa73z_dczpljif4m2x_text_box\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"text_box\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"html/body/div/div/form/div/input\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"google_search_button\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"button\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"html/body/div/div/form/div/div/div/center/input\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"×_button\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"button\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//button[contains(text(),'×')]\",\n" +
            "      \"html/body/div/div/dialog/div/button\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"images_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'Images')]\",\n" +
            "      \"html/body/div/div/div/div/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"ਪੰਜਾਬੀ_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'ਪੰਜਾਬੀ')]\",\n" +
            "      \"html/body/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"ગુજરાતી_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'ગુજરાતી')]\",\n" +
            "      \"html/body/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"search_history_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'Search history')]\",\n" +
            "      \"html/body/div/div/div/div/div/ul/li/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"sign_in_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'Sign in')]\",\n" +
            "      \"html/body/div/div/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"i'm_feeling_lucky_button\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"button\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"html/body/div/div/form/div/div/div/center/input\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"हिन्दी_link\": {\n" +
            "    \"objectGenerate\": \"generate\",\n" +
            "    \"locator_type\": \"xpath\",\n" +
            "    \"element_type\": \"link\",\n" +
            "    \"platform\": \"web\",\n" +
            "    \"locator_value\": [\n" +
            "      \"//a[contains(text(),'हिन्दी')]\",\n" +
            "      \"html/body/div/div/div/div/a\"\n" +
            "    ]\n" +
            "  }\n" +
            "}";

    public static void main(String[] args) throws ParseException {
        GeneratePageObjectFile pageObjectFile = new GeneratePageObjectFile();

        JSONParser parser = new JSONParser();
        JSONObject object = (JSONObject) parser.parse(jsonSting);

        pageObjectFile.createPageObjectFile(object, "testing");
    }

    public void createPageObjectFile(JSONObject array, String fileName) {

        try {

            Path fileName1 = Path.of(
                    EntryPoint.pageObjectDirectory + "/" + fileName);

            Files.writeString(fileName1, array.toJSONString());


            System.out.println("---------------------------------------- file generated " + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
