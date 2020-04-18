/**
 *
 *  @author Zaborowski Mateusz S19101
 *
 */

package zad1;


import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Tools {
    public static Options createOptionsFromYaml(String fileName) throws FileNotFoundException {
        Map<String, Object> map = (new Yaml()).load(new FileInputStream(fileName));
        return new Options((String)map.get("host"), (int)map.get("port"), (boolean)map.get("concurMode"), (boolean)map.get("showSendRes"), (LinkedHashMap)map.get("clientsMap"));
    }
}
