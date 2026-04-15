import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class Main {

    // UC10 Method
    public static int totalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("AC", 50),
                new Bogie("Sleeper", 70),
                new Bogie("General", 40)
        );

        int total = totalCapacity(bogies);

        System.out.println("Total Seating Capacity: " + total);
    }
}