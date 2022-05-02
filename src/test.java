import java.util.*;

public class test {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // putting elements to the key-value pairs in hashtable
        hashtable.put(100, "Aditya");
        hashtable.put(10, "Harsh");
        hashtable.put(60, "Sakib");
        hashtable.put(30, "Sumant");
        hashtable.put(20, "Sumit");
        hashtable.put(20, "Amit");

        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}
