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
@PropertySource("classpath:datasource.properties")

public class PropertyConfig {

  @Autowired
  Environment env;

  @Value("${guru.username}")
  String username;

  @Value("${guru.password}")
  String password;

  @Value("${guru.url}")
  String url;

  @Bean
  public FakeDataSource fakeDataSource() {
    FakeDataSource fakeDataSource = new FakeDataSource();
    fakeDataSource.setUsername(username);
    fakeDataSource.setPassword(password);
    fakeDataSource.setUrl(url);
    return fakeDataSource;
  }

  @Bean
  public static PropertySourcesPlaceholderConfigurer properties() {
    PropertySourcesPlaceholderConfigurer  propertySourcePlaceholderCounfigurer = new
        PropertySourcesPlaceholderConfigurer();
    return propertySourcePlaceholderCounfigurer;
  }
}
