package am.itspacellc.java_8_feature.util;

import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Component
public class ListGenerator {


  public List<String> returnNewListString(int size) {
    LinkedList<String> list = new LinkedList<>();
    for (int i = 0; i < size; i++) {

      list.add("StringList: " + i);
    }
    return list;
  }


  public List<Integer> returnNewListInteger(int size) {
    LinkedList<Integer> list = new LinkedList<>();
    for (int i = 0; i < size; i++) {
      list.add(i);
    }
    return list;
  }

  public Map<Integer, String> returnNewMap(int size) {
    LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
    for (int i = 0; i < size; i++) {
      map.put(i, "StringMap: " + i);
    }
    return map;
  }

}
