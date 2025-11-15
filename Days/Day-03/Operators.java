public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        
        // Arithmetic operations
        System.out.println("➕ Addition: " + (a + b));
        System.out.println("➖ Subtraction: " + (a - b));
        System.out.println("✖️ Multiplication: " + (a * b));
        System.out.println("➗ Division: " + (a / b));
        System.out.println("📊 Modulus: " + (a % b));
        
        // Comparison operations
        System.out.println("🤔 Is a equal to b? " + (a == b));
        System.out.println("🤔 Is a greater than b? " + (a > b));
        
        // Logical operations
        boolean isSunny = true;
        boolean isWeekend = false;
        System.out.println("🌞 Should we go out? " + (isSunny && isWeekend));
    }
}