import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// this class will transform a Map<Integer, List<String>> into another Map in <String, Integer> format.
public class Etl {
  public Map<String, Integer> transform(Map<Integer, List<String>> old) {
    Map<String, Integer> myMap = new HashMap<String, Integer>();
    for (Entry<Integer, List<String>> entry : old.entrySet()) {
      int points = entry.getKey();
      for (String oldLetter : entry.getValue()) {
        String letter = oldLetter.toLowerCase();
        myMap.put(letter, points);
      }
    }
    return myMap;
  }
}
