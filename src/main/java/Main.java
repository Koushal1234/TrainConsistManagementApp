import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class Main {

    // ✅ LOOP METHOD
    public static List<Bogie> filterUsingLoop(List<Bogie> bogies) {
        List<Bogie> result = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 50) {
                result.add(b);
            }
        }
        return result;
    }

    // ✅ STREAM METHOD
    public static List<Bogie> filterUsingStream(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.capacity > 50)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("UC13 Ready");
    }
}