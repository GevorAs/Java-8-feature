package am.itspacellc.java_8_feature;

import am.itspacellc.java_8_feature.service.AnyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Java8FeatureApplicationTests {

  @Autowired
  AnyService anyService;

  @Test
  public void foreachExampleForListTest() {
    anyService.foreachExampleForList();
  }

  @Test
  public void foreachExampleForMapTest() {
    anyService.foreachExampleForMap();
  }

  @Test
  public void foreachWithCustomConsumerTest() {
    anyService.foreachWithCustomConsumer();
  }

  @Test
  public void intefacedefaultAndStaticMethodsExampleTest() {
    anyService.intefacedefaultAndStaticMethodsExample();
  }

  @Test
  public void filterExample() {
    anyService.filterExample();
  }

  @Test
  public void mapExampleTest() {
    anyService.mapExample();
  }

  @Test
  public void mapPrimitivesExampleTest() {
    anyService.mapPrimitivesExample();
  }

  @Test
  public void flatMapExampleTest() {
    anyService.flatMapExample();
  }
}
