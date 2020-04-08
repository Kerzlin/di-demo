package guru.framework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary // on se izvrASAVA za sve koji nasledjuju GreetingService jer je primary
public class PrimaryGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "PRIMARY";
  }
}
