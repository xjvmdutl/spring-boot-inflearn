package hello.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @GetMapping("hello-spring")
  public String hell(){
    System.out.println("HelloController.hell");
    return "hello spring!";
  }
}
