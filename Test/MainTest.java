import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class MainTest {

    // UC8 LOGIC METHOD
    public static List<Bogie> filterBogies(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("=== UC8: Filter Bogies ===");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 50));
        bogies.add(new Bogie("AC Chair", 70));
        bogies.add(new Bogie("First Class", 65));

        List<Bogie> filtered = filterBogies(bogies);

        System.out.println("Filtered Bogies (Capacity > 60):");
        for (Bogie b : filtered) {
            System.out.println(b.name + " - " + b.capacity);
        }
    }
}