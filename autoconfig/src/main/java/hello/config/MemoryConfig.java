package hello.config;

import memory.MemoryCondition;
import memory.MemoryController;
import memory.MemoryFinder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Conditional(MemoryCondition.class) //스프링이 뜰때, 먼저 실행되어 검증한다.
@ConditionalOnProperty(name = "memory", havingValue = "on")
public class MemoryConfig {

  @Bean
  public MemoryFinder memoryFinder(){
    return new MemoryFinder();
  }

  @Bean
  public MemoryController memoryController(){
    return new MemoryController(memoryFinder());
  }
}
