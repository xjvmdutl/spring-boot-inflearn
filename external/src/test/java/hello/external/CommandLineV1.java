package hello.external;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommandLineV1 {

  public static void main(String[] args) {
    for (String arg : args) {
      log.info("arg = {}", arg); //Key=value 형식이 아니다.
      String[] keyValue = arg.split("=");
      log.info("key = {}, value = {}", keyValue[0], keyValue[1]); //개발자가 직접 파싱해야한다
    }
  }
}
