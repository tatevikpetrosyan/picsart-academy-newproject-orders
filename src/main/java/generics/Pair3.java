package generics;

import java.util.Map;

public class Pair3 <K,V> {
    private Map<K,V> myMap;

    public void setMyMap(Map<K, V> myMap) {
        this.myMap = myMap;
    }
    public Map<K,V> getMyMap() {
        return myMap;
    }
}
