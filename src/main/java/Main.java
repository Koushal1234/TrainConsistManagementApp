import java.util.*;

// ✅ Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// ✅ Goods Bogie Class
class GoodsBogie {
    String shape;   // Rectangular / Cylindrical
    String cargo;

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    // ✅ Assign cargo with safety check
    void assignCargo(String cargo) {
        try {
            // Rule: Rectangular cannot carry Petroleum
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment!");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed.\n");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");   // ✅ Safe

        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");   // ❌ Unsafe

        GoodsBogie b3 = new GoodsBogie("Rectangular");
        b3.assignCargo("Coal");        // ✅ Safe

        System.out.println("Program continues safely...");
    }
}