package DataFiles;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

public class JSONTOLIST_HASHMAP {
    public List<HashMap<String, String>> getJsonData() throws IOException {
        String jsonfilestring = FileUtils.readFileToString(new File("C:\\Users\\ashwin.poojari\\IdeaProjects\\untitled15\\src\\test\\java\\DataFiles\\HashmapFile.json"), StandardCharsets.UTF_8);

        // Add jackson bind to pom.xml
        //then use ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        List<HashMap<String,String>> List = mapper.readValue(jsonfilestring, new TypeReference<java.util.List<HashMap<String, String>>>() {
        });
        return List;
    }
}
