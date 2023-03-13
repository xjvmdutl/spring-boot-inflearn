package hello.external;

import java.util.List;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;

@Slf4j
public class CommandLineV2 {

  public static void main(String[] args) {
    for (String arg : args) {
      log.info("arg {}", arg); //자바의 기본으로 문자 그대로 출력
    }
    ApplicationArguments appArgs = new DefaultApplicationArguments(args);
    log.info("SourceArgs = {}", List.of(appArgs.getSourceArgs())); //배열을 참조값을 반환해서 값을 보기 위해 list로 변경
    log.info("NoneOptionsArgs = {}", appArgs.getNonOptionArgs());
    log.info("OptionsNames = {}", appArgs.getOptionNames());

    Set<String> optionNames = appArgs.getOptionNames();
    for (String optionName : optionNames) {
      log.info("option arg {} = {}", optionName, appArgs.getOptionValues(optionName));

      List<String> url = appArgs.getOptionValues("url"); //같은 키값으로 여러 값이 들어갈 수 있기 때문에 리스트를 반환한다.
      List<String> username = appArgs.getOptionValues("username");
      List<String> password = appArgs.getOptionValues("password");
      List<String> mode = appArgs.getOptionValues("mode");
      log.info("url={}",url);
      log.info("username={}",username);
      log.info("password={}",password);
      log.info("mode={}",mode); //통문자라 key-value 형식으로 못 뽑는다.
    }
  }
}
