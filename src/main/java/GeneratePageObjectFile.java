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
