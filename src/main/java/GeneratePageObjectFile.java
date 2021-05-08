import org.json.simple.JSONArray;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeneratePageObjectFile {



    public void createPageObjectFile(JSONArray array,String fileName)

    {

        FileWriter file = null;
        try {
            file = new FileWriter(new File(EntryPoint.pageObjectDirectory+"/"+fileName));
            file.write(array.toJSONString());
            System.out.println("---------------------------------------file generated " +fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
