package guru.framework.didemo.config;

import guru.framework.didemo.examplebean.FakeDataSource;
import guru.framework.didemo.examplebean.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
public class PropertyConfig {

  // PropertySourcesPlaceholderConfigurer was used when we have other properties files, beside application.properties

  @Value("${guru.username}")
  String username;

  @Value("${guru.password}")
  String password;

  @Value("${guru.url}")
  String url;

  @Value("${guru.jms.username}")
  String jmsUsername;

  @Value("${guru.jms.password}")
  String jmsPassoword;

  @Value("${guru.jms.url}")
  String jmsUrl;

  @Bean
  public FakeDataSource fakeDataSource() {
    FakeDataSource fakeDataSource = new FakeDataSource();
    fakeDataSource.setUsername(username); // usefull for setting password
    fakeDataSource.setPassword(password);
    fakeDataSource.setUrl(url);
    return fakeDataSource;
  }

  @Bean
  public FakeJmsBroker fakeJmsBroker(){
    FakeJmsBroker jmsBroker = new FakeJmsBroker();
    jmsBroker.setUsername(jmsUsername);
    jmsBroker.setPassword(jmsPassoword);
    jmsBroker.setUrl(jmsUrl);
    return jmsBroker;
  }

}
