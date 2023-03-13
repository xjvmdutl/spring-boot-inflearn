package hello;

import java.util.Properties;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaSystem {

  public static void print() {
    Properties properties = System.getProperties();
    for (Object key : properties.keySet()) {
      log.info("prop {} = {} ", key, System.getProperty(String.valueOf(key)));
    }

    String url = System.getProperty("url");
    String username = System.getProperty("username");
    String password = System.getProperty("password");

    log.info("user={}", url);
    log.info("username={}", username);
    log.info("password={}", password);
  }
}
