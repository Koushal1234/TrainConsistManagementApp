// Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    String name;
    int capacity;

    PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than 0");
        }
        this.name = name;
        this.capacity = capacity;
    }
}

public class Main {

    public static void main(String[] args) {

        try {
            PassengerBogie b1 = new PassengerBogie("AC", 50);
            System.out.println("Bogie created: " + b1.name);

            // Invalid case
            PassengerBogie b2 = new PassengerBogie("Sleeper", -10);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}