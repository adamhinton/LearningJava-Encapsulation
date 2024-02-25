public class Main {
    public static void main(String[] args) {

        EnhancedPlayer tim = new EnhancedPlayer("Tim");

        System.out.printf("Initial health is %d", tim.healthRemaining());

    }
}

// Allowing direct access to fields can bypass checks and operations
// Encourages coupling between calling code and class
// Calling code can have to take on resp for initializing a new class

