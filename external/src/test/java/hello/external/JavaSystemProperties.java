package hello.external;

import java.util.Properties;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaSystemProperties {

  public static void main(String[] args) {

    System.setProperty("hello_key", "hello_value"); //어플리케이션 실행 시점에도 추가할 수 있다.
    String helloValue = System.getProperty("hello_key");
    log.info("helloValue: {}", helloValue);

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
