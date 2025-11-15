/**
 * A demonstration of if-else-if logic using boolean variables.
 */
public class ConditionalActivity
{
    public static void main(String[] args) {
        // --- Input Variables ---
        boolean isWeekend = true;
        boolean hasMoney = true;

        // --- Conditional Logic ---
        if (isWeekend && hasMoney) {
            System.out.println("🎮 Let's go to movies!");
        } else if (isWeekend && !hasMoney) {
            System.out.println("🏠 Let's stay home and code!");
        } else {
            System.out.println("💼 Time to work or study!");
        }
    }
}