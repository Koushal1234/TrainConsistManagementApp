import java.util.*;
import java.util.function.Predicate;

class GoodsBogie {
    String type;   // Cylindrical / Box
    String cargo;  // Petroleum / Coal

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class Main {

    // UC12 Method
    public static boolean isTrainSafe(List<GoodsBogie> bogies) {

        // Rule: Cylindrical → only Petroleum allowed
        Predicate<GoodsBogie> safetyRule = b ->
                !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum");

        return bogies.stream().allMatch(safetyRule);
    }

    public static void main(String[] args) {

        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Box", "Coal"),
                new GoodsBogie("Cylindrical", "Petroleum")
        );

        boolean result = isTrainSafe(bogies);

        System.out.println("Train Safety Status: " + result);
    }
}