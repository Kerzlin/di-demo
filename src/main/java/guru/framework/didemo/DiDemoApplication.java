package guru.framework.didemo;

import java.sql.Timestamp;
import java.util.Calendar;

import guru.framework.didemo.controllers.MyController;

import guru.framework.didemo.examplebean.FakeDataSource;
import guru.framework.didemo.examplebean.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
    MyController controller = (MyController) ctx.getBean("myController");
   // controller.hello();
 //   System.out.println(controller.hello());
 //   System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
 //   System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
 //   System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
    System.out.println(fakeDataSource.getUsername());
    System.out.println(fakeDataSource.getPassword());
    System.out.println(fakeDataSource.getUrl());

    FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
    System.out.println(fakeJmsBroker.getUsername());
  }
}
