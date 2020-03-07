package api.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class UtilsMethod {

    public static String getValue(String value) {
        Properties properties = new Properties();
        try {
            File file;
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/" + "userData.properties");
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String data = properties.getProperty(value);
        try {
            data = new String(data.getBytes(), StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

}
