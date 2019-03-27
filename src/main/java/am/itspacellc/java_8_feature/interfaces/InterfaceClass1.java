package am.itspacellc.java_8_feature.interfaces;

public class InterfaceClass1 implements Interface1, Interface2 {
  @Override
  public void method1(String str) {

    System.out.println("method1 from InterfaceClass1 : " + str);
  }

  @Override
  public void method2() {
    System.out.println("method2 from InterfaceClass1");

  }

  @Override
  public void log(String str) {
    System.out.println("log from InterfaceClass1 : " + str);

  }
}
