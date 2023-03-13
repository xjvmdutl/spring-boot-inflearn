package hello.external;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OsEnv {

  public static void main(String[] args) {
    Map<String, String> envMap = System.getenv();
    for (String key : envMap.keySet()) {
      log.info("env {} = {}", key, System.getenv(key));
    }

    //DBURL=dev.db.com (개발 OS 설정)
    //DBURL=prod.db.com (운영 OS 설정)
    //String dburl = System.getenv("DBURL");
  }
}
