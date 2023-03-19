package hello.datasource;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Getter
@ConfigurationProperties("my.datasource")
public class MyDataSourcePropertiesV2 {

  private String url;
  private String username;
  private String password;
  private Etc etc;

  //@ConstructorBinding //생성자가 하나일 경우에는 생략 가능하다
  public MyDataSourcePropertiesV2(String url, String username, String password, @DefaultValue Etc etc) {
    this.url = url;
    this.username = username;
    this.password = password;
    this.etc = etc;
  }

  @Getter
  public static class Etc{
    private int maxConnection;
    private Duration timeout;
    private List<String> options;

    public Etc(int maxConnection, Duration timeout, @DefaultValue("DEFAULT") List<String> options) {
      this.maxConnection = maxConnection;
      this.timeout = timeout;
      this.options = options;
    }
  }

}
