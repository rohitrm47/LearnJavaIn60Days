public class BreakStatement {
    public static void main(String[] args) {
        System.out.println("--- Loop 1: Using break ---");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit loop when i is 5
            }
            System.out.println(i);
        }
    }
}