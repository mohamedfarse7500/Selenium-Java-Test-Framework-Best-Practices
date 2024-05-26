package pom.eviroments;

import org.aeonbits.owner.Config;

@Config.Sources(
        {
                "file:./src/test/resources/${env}.properties",
                "file:./src/test/resources/stag.properties"
        }
        )
public interface Environment extends Config {
    @Key("baseURL")
    String getBaseURL();
}
