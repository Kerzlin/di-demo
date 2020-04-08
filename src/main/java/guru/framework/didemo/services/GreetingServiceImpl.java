package guru.framework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

  public static final String HELLO_GURUS = "GreetingServiceImpl";

  @Override
  public String sayGreeting() {
    return HELLO_GURUS;
  }
}