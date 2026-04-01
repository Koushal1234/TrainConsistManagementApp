import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create a list to store coaches
        List<Coach> train = new ArrayList<>();

        // Add coaches to the train consist
        train.add(new Coach("S1", "Sleeper", 72));
        train.add(new Coach("A1", "AC", 48));
        train.add(new Coach("G1", "General", 90));

        // Display train consist details
        System.out.println("Train Consist Details:");
        System.out.println("----------------------");

        for (Coach coach : train) {
            System.out.println("Coach ID: " + coach.getCoachId());
            System.out.println("Type: " + coach.getType());
            System.out.println("Capacity: " + coach.getCapacity());
            System.out.println();
        }
    }
}

// Coach class
class Coach {
    private String coachId;
    private String type;
    private int capacity;

    public Coach(String coachId, String type, int capacity) {
        this.coachId = coachId;
        this.type = type;
        this.capacity = capacity;
    }

    public String getCoachId() {
        return coachId;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}