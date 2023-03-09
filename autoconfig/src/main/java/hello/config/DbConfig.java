package hello.config;

import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.transaction.TransactionManager;

@Slf4j
//@Configuration //해당 부분을 주석하면, 빈등록을 등록하지 않는다
public class DbConfig {

  @Bean //@Bean을 주석처리해도 빈등록을 하지 않는다
  public DataSource dataSource() {
    log.info("dataSource 빈 등록");
    HikariDataSource dataSource = new HikariDataSource();
    dataSource.setDriverClassName("org.h2.Driver");
    dataSource.setJdbcUrl("jdbc:h2:mem:test");
    dataSource.setUsername("sa");
    dataSource.setPassword("");
    return dataSource;
  }

  @Bean
  public TransactionManager transactionManager(){
    log.info("transactionManager 빈 등록");
    return new JdbcTransactionManager(dataSource());
  }

  @Bean
  public JdbcTemplate jdbcTemplate(){
    log.info("jdbcTemplate 빈 등록");
    return new JdbcTemplate(dataSource());
  }

}
