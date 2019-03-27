package am.itspacellc.java_8_feature.service;

import am.itspacellc.java_8_feature.interfaces.Interface1;
import am.itspacellc.java_8_feature.interfaces.InterfaceClass1;
import am.itspacellc.java_8_feature.util.ListGenerator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class AnyService {


  private List<String> stringList;
  private List<Integer> integerList;
  private Map<Integer, String> map;


  public AnyService(ListGenerator listGenerator) {
    stringList = listGenerator.returnNewListString(10);
    integerList = listGenerator.returnNewListInteger(10);
    map = listGenerator.returnNewMap(10);
  }


  public void foreachExampleForList() {
    stringList.forEach(System.out::println);
  }

  public void foreachExampleForMap() {
    map.forEach((a, b) -> System.out.println("key : " + a + " , value : " + b));
  }

  public void foreachWithCustomConsumer() {
    stringList.forEach(s -> {
//        your logic
      System.out.println("with any logic: " + s);
    });
  }

  public void intefacedefaultAndStaticMethodsExample() {
    stringList.forEach(Interface1::print);

    InterfaceClass1 interfaceClass1 = new InterfaceClass1();
    interfaceClass1.method2();
    stringList.forEach(interfaceClass1::log);
    stringList.forEach(interfaceClass1::method1);
  }

  public void filterExample() {
    integerList.forEach(System.out::print);
    System.out.println();
    System.out.print("at 0 to 9 evens : ");
    integerList.stream().filter(a -> a % 2 == 0).forEach(System.out::print);
    System.out.println();
    System.out.println("at 0 to 9 evens count: " + integerList.stream().filter(a -> a % 2 == 0).count());
    System.out.println("at 0 to 9 big 5: " + integerList.stream().filter(a -> a > 5).count());
    integerList.stream().filter(a -> a > 5).forEach(System.out::print);
    System.out.println();
    System.out.println("at 0 to 9 small 5: " + integerList.stream().filter(a -> a < 5).count());
    integerList.stream().filter(a -> a < 5).forEach(System.out::print);
    System.out.println();
  }

  public void mapExample() {
    System.out.println("do anything with elements from list.map return all list \n element  '*2'");
    integerList.stream().map(a -> a * 2).forEach(System.out::println);

  }

  public void mapPrimitivesExample() {
    System.out.println("get sum from list elements");
    System.out.println(integerList.stream().mapToInt(i -> i).sum());
  }

  public void flatMapExample() {
//    don't repeat this example ))
    LinkedList<List> linkedList = new LinkedList<>();
    linkedList.add(integerList);
    linkedList.add(stringList);
    linkedList.add(new ArrayList<>(map.values()));
    linkedList.stream().flatMap(Collection::stream).forEach(System.out::println);
  }
}
