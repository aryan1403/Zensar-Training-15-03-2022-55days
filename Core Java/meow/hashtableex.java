package meow;

import java.util.Hashtable;

public class hashtableex {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("Aaryan", 100);
        ht.put("Aditya", 110);
        ht.put("Aaryan", 150); // Updated
        ht.put("Cat", 100000);

        ht.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });

        System.out.println(ht);
    }
}
