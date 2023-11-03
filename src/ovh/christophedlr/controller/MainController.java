package ovh.christophedlr.controller;

import ovh.christophedlr.view.Main;

import java.awt.event.ActionListener;
import java.util.ResourceBundle;
import java.util.Properties;

/**
 * Controller of main window
 */
public class MainController {
    private ResourceBundle resourceBundle;
    private Properties properties;

    /**
     * Constructor
     * @param resourceBundle resource bundle
     * @param properties properties
     */
    public MainController(ResourceBundle resourceBundle, Properties properties) {
        this.resourceBundle = resourceBundle;
        this.properties = properties;
    }

    /**
     * Action listener for menu file exit
     * @param main main window
     * @return action listener
     */
    public ActionListener MenuFileExit(Main main) {
        return e -> main.dispose();
    }
}
