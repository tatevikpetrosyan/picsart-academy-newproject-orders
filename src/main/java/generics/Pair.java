package generics;

public class Pair <K, V> {
    private K key;
    private V value;

    public void printing() {
        System.out.println(key + "-" + value);
    }

    public K getKey() {
        return key;
    }
    public void setKey(K key){
        this.key = key;
    }

    public void setValue (V value) {
        this.value = value;
    }
    public V getValue() {
        return value;
    }

}
