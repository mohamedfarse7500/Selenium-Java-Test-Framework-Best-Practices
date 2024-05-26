package pom.utils;

import java.util.Properties;

public class ConfigLoader {
    private  final Properties properties;
    private  static ConfigLoader configLoader;
    private ConfigLoader() {
    properties = PropertiesUtils.propertiesLoader("src/test/resources/config.properties");
    }
    public static ConfigLoader getInstance(){
    if(configLoader == null)
    {
        configLoader = new ConfigLoader();
    }
    return configLoader;
    }

    public String getBaseURL()
    {
        return  properties.getProperty("baseURL");

    }
}
