package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    public static Properties initialize_Properties() throws RuntimeException {
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties");
            properties.load(fileInputStream);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return getProperties();
    }

    public static Properties readaAccountInfo() throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = Files.newInputStream(Paths.get("src/test/resources/accountInfo.properties"));
        properties.load(inputStream);

        return properties;
    }

    public static Properties readAdressInfo() throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = Files.newInputStream(Paths.get("src/test/resources/adressInfo.properties"));
        properties.load(inputStream);

        return properties;
    }
    public static Properties getProperties() {
        return properties;
    }

}