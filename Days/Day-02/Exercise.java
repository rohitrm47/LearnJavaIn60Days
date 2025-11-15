/**
 * Day 2 Exercises: Practice with Variables
 * Complete these exercises to reinforce your learning
 */
public class Exercise {
    public static void main(String[] args) {
        
        // 🎯 EXERCISE 1: Personal Profile
        System.out.println("🎯 EXERCISE 1: PERSONAL PROFILE");
        
        // TODO: Create variables for your personal information
        String myName = "[Your Name]";           // Replace with your name
        int myAge = 0;                           // Replace with your age
        double favoriteNumber = 0.0;             // Replace with your favorite number
        boolean likeProgramming = true;          // Change to true or false
        char nameInitial = 'X';                  // Replace with your first initial
        
        // TODO: Display your profile
        System.out.println("👤 My Name: " + myName);
        System.out.println("🎯 My Age: " + myAge);
        System.out.println("❤️ Favorite Number: " + favoriteNumber);
        System.out.println("💻 Like Programming: " + likeProgramming);
        System.out.println("🔤 Name Initial: " + nameInitial);
        
        // 🎯 EXERCISE 2: Simple Calculator
        System.out.println("\n🎯 EXERCISE 2: SIMPLE CALCULATOR");
        
        // TODO: Create two number variables
        double number1 = 15.0;                   // Change this number
        double number2 = 3.0;                    // Change this number
        
        // TODO: Calculate results
        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double quotient = number1 / number2;
        
        // TODO: Display calculations
        System.out.println("🔢 Numbers: " + number1 + " and " + number2);
        System.out.println("➕ Sum: " + number1 + " + " + number2 + " = " + sum);
        System.out.println("➖ Difference: " + number1 + " - " + number2 + " = " + difference);
        System.out.println("✖️ Product: " + number1 + " * " + number2 + " = " + product);
        System.out.println("➗ Quotient: " + number1 + " / " + number2 + " = " + quotient);
        
        // 🎯 EXERCISE 3: Type Conversion Practice
        System.out.println("\n🎯 EXERCISE 3: TYPE CONVERSION");
        
        // TODO: Practice type casting
        double price = 29.99;
        int roundedPrice = (int) price;          // Convert to int
        
        int items = 5;
        double decimalItems = items;             // Convert to double (automatic)
        
        System.out.println("💰 Original Price: " + price);
        System.out.println("💵 Rounded Price: " + roundedPrice);
        System.out.println("📦 Items as int: " + items);
        System.out.println("📦 Items as double: " + decimalItems);
        
        // 🎯 BONUS: Create a short story using variables
        System.out.println("\n🎯 BONUS: MINI STORY");
        
        String character = "Java Developer";
        String location = "coding dojo";
        int hoursPracticed = 8;
        boolean becameExpert = true;
        
        System.out.println("Once upon a time, a " + character);
        System.out.println("practiced at the " + location + " for " + hoursPracticed + " hours.");
        System.out.println("Did they become an expert? " + becameExpert + "!");
    }
}