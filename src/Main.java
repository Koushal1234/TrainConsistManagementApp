import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101");
        bogieIds.add("BG103");

        System.out.println("Unique Bogie IDs: " + bogieIds);
    }
}