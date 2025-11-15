Day 3: Operators & User Input ⚡
🎯 Today's Goals
✅ Master arithmetic operators (+, -, *, /, %)

✅ Understand comparison operators (==, !=, >, <)

✅ Learn logical operators (&&, ||, !)

✅ Get user input using Scanner class

✅ Build interactive programs

🔢 Arithmetic Operators
Operator	Name	Example	Result
+	Addition	5 + 3	8
-	Subtraction	5 - 3	2
*	Multiplication	5 * 3	15
/	Division	5 / 3	1
%	Modulus	5 % 3	2
⚖️ Comparison Operators
Operator	Name	Example	Result
==	Equal to	5 == 3	false
!=	Not equal	5 != 3	true
>	Greater than	5 > 3	true
<	Less than	5 < 3	false
>=	Greater or equal	5 >= 3	true
<=	Less or equal	5 <= 3	false
🧠 Logical Operators
Operator	Name	Example	Result
&&	AND	true && false	false
`		`	OR	`true		false`	true
!	NOT	!true	false
📥 User Input with Scanner
To get input from users, we use the Scanner class:

java
import java.util.Scanner;  // Import Scanner class

Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();  // Read text input
int age = scanner.nextInt();       // Read integer input
💻 Code Examples
Basic Operators:
java
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
User Input Example:
java
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("👋 What's your name? ");
        String name = scanner.nextLine();
        
        System.out.print("🎯 How old are you? ");
        int age = scanner.nextInt();
        
        System.out.println("✨ Hello " + name + "! You are " + age + " years young!");
        
        scanner.close(); // Don't forget to close the scanner!
    }
}
🎯 Exercises
Exercise 1: Simple Calculator
Create a calculator that takes two numbers and shows:

Sum, difference, product, quotient, and remainder

Exercise 2: Age Checker
Ask user for their age and determine if they can:

Vote (18+)

Drive (16+)

Drink (21+)

Exercise 3: Number Properties
Check if a number is:

Positive, negative, or zero

Even or odd

Exercise 4: Temperature Converter
Convert Celsius to Fahrenheit using the formula: (C × 9/5) + 32

⚠️ Important Notes
Scanner Buffer Issue:
When switching from nextInt() to nextLine(), you need to clear the buffer:

java
int number = scanner.nextInt();
scanner.nextLine(); // Clear the buffer
String text = scanner.nextLine(); // Now this will work
Operator Precedence:
Use parentheses to control operation order:

java
int result1 = 5 + 3 * 2;    // Result: 11 (multiplication first)
int result2 = (5 + 3) * 2;  // Result: 16 (addition first)
✅ Day 3 Checklist
➕ Understand arithmetic operators

⚖️ Practice comparison operators

🧠 Master logical operators

📥 Get user input with Scanner

🎯 Complete all exercises

🎮 Build interactive programs

💡 Pro Tip
Always close your Scanner with scanner.close() to prevent resource leaks!

