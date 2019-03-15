package guru.framework.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  public String hello(){
     System.out.println("Heloo");
     return "foo";
  }
}
