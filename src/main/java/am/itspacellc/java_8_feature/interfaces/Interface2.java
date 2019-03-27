package am.itspacellc.java_8_feature.interfaces;

@FunctionalInterface
public interface Interface2 {

  void method2();

  default void log(String str) {
    System.out.println("Interface2 logging::" + str);
  }

}

