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

    // UC9 Method
    public static Map<String, List<Bogie>> groupBogies(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));
    }

    public static void main(String[] args) {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("AC", 50),
                new Bogie("Sleeper", 70),
                new Bogie("AC", 65),
                new Bogie("General", 40)
        );

        Map<String, List<Bogie>> grouped = groupBogies(bogies);

        System.out.println("Grouped Bogies:");
        grouped.forEach((key, value) -> {
            System.out.println(key + " -> " + value.size() + " bogies");
        });
    }
}