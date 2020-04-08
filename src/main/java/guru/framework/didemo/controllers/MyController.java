package guru.framework.didemo.controllers;

import guru.framework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  private GreetingService greetingService;

  public MyController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String hello(){
  //   System.out.println("Heloo");
     return greetingService.sayGreeting();
  }
}
