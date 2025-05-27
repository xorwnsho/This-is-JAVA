package chap15.sec04;

import java.io.IOException;
import java.util.Properties;

public class PropertiesMain {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        //PropertiesMain.class와 동일한 ClassPath에 있는 database.properties파일 로드
        properties.load(PropertiesMain.class.getResourceAsStream("database.properties"));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String admin = properties.getProperty("admin");

        System.out.println("driver: " + driver);
        System.out.println("url = " + url);
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("admin = " + admin);
    }
}
