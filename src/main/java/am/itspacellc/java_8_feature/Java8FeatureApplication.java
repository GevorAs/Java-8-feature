package am.itspacellc.java_8_feature;

import am.itspacellc.java_8_feature.interfaces.Interface1;
import am.itspacellc.java_8_feature.service.AnyService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java8FeatureApplication implements CommandLineRunner {

  private final AnyService anyService;

  public Java8FeatureApplication(AnyService anyService) {
    this.anyService = anyService;
  }

  public static void main(String[] args) {
    SpringApplication.run(Java8FeatureApplication.class, args);
  }

  @Override
  public void run(String... args) throws InterruptedException {
////  functional interfaces
//    we can use interfaces for creating anonymous classes
//    Runnable interface with method run()
    Runnable r = () -> System.out.println("My Runnable");
    r.run();
//    or we can use our custom functional interface
    Interface1 ourInterface = (a) -> System.out.println("custom interface1 with him method1");
//    it is default method
    ourInterface.log("your variable");
//    "variable ignored" not printing because we are using our logic, up, but "ourInterface.method1("variable ignored")" required
    ourInterface.method1("variable ignored");
//    if we want use variable in method we can do it
    Interface1 ourInterface12 = System.out::println;
    ourInterface12.method1("method1 ourInterface12");
//---------------------------

//    foreach feature for List
    anyService.foreachExampleForList();
//    foreach with map
    anyService.foreachExampleForMap();
//    foreach with custom consumer
    anyService.foreachWithCustomConsumer();
//    static and default methods in interface
    anyService.intefacedefaultAndStaticMethodsExample();
//---------------------------
//    streams
//    stream filter example
    anyService.filterExample();
//    map example
    anyService.mapExample();
//    map primitives
    anyService.mapPrimitivesExample();
//    flat map example
    anyService.flatMapExample();


//

//
  }
}
