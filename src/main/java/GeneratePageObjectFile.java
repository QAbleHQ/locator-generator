import org.json.simple.JSONArray;

import java.io.FileWriter;
import java.io.IOException;

public class GeneratePageObjectFile {



    public void createPageObjectFile(JSONArray array)

    {

        FileWriter file = null;
        try {
            file = new FileWriter("/Volumes/My HD /QAble/Projects/QAble Research/locator-generator/src/test/java/crunchify.json");
            file.write(array.toJSONString());
            System.out.println("---------------------------------------file generating");
        } catch (IOException e) {
            e.printStackTrace();
        }



    }



}
