public class ContinueStatement {
    public static void main(String[] args) {
        System.out.println("\n--- Loop 2: Using continue ---");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // Checks if i is an even number
                continue; // Skip even numbers
            }
            System.out.println("Odd: " + i);
        }
    }
}