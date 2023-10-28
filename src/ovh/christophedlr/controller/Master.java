package ovh.christophedlr.controller;

import ovh.christophedlr.view.Main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Master {
    public void run() throws IOException {
        InputStream input = getClass().getClassLoader().getResourceAsStream("resources/config.properties");
        Properties properties = new Properties();
        properties.load(input);

        Main main = new Main(properties);
    }
}
