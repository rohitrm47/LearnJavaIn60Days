Day 4: Control Flow - If/Else Statements 🎮
🎯 Today's Goals
✅ Understand conditional statements

✅ Master if, else if, and else statements

✅ Learn nested if statements

✅ Practice logical conditions

✅ Build decision-making programs

🧠 What is Control Flow?
Control flow lets your program make decisions and execute different code blocks based on conditions. Think of it like making choices in real life!

🔀 If/Else Statements
Basic Syntax:
java
if (condition) {
    // Code to run if condition is TRUE
} else {
    // Code to run if condition is FALSE
}
Multiple Conditions:
java
if (condition1) {
    // Code for condition1
} else if (condition2) {
    // Code for condition2  
} else {
    // Code if all conditions are false
}
💻 Code Examples
Simple If/Else:
java
int age = 18;

if (age >= 18) {
    System.out.println("🎉 You are an adult!");
} else {
    System.out.println("👶 You are a minor.");
}
Multiple Conditions:
java
int score = 85;

if (score >= 90) {
    System.out.println("🎯 Grade: A");
} else if (score >= 80) {
    System.out.println("🎯 Grade: B"); 
} else if (score >= 70) {
    System.out.println("🎯 Grade: C");
} else {
    System.out.println("🎯 Grade: F");
}
Logical Operators in Conditions:
java
boolean isWeekend = true;
boolean hasMoney = true;

if (isWeekend && hasMoney) {
    System.out.println("🎮 Let's go to movies!");
} else if (isWeekend && !hasMoney) {
    System.out.println("🏠 Let's stay home and code!");
} else {
    System.out.println("💼 Time to work or study!");
}
🎯 Exercises
Exercise 1: Number Checker
Create a program that checks if a number is:

Positive and even

Positive and odd

Negative

Zero

Exercise 2: Temperature Advisor
Based on temperature, suggest activities:

Above 30°C: "🏊 Go swimming"

20-30°C: "🚶 Go for a walk"

10-20°C: "☕ Drink hot chocolate"

Below 10°C: "🔥 Stay by fireplace"

Exercise 3: Simple Login System
Check username and password:

Correct both: "🔓 Login successful"

Wrong username: "❌ User not found"

Wrong password: "❌ Incorrect password"

Exercise 4: Age Category
Categorize ages:

0-12: "👶 Child"

13-19: "👦 Teenager"

20-64: "👨 Adult"

65+: "👴 Senior"

🎨 Nested If Statements
You can put if statements inside other if statements:

java
int number = 15;

if (number > 0) {
    if (number % 2 == 0) {
        System.out.println("Positive even number");
    } else {
        System.out.println("Positive odd number");
    }
} else {
    System.out.println("Non-positive number");
}
⚡ Quick Tips
Use meaningful conditions:

java
// Good ✅
if (isRaining && hasUmbrella) 

// Avoid ❌  
if (a && b)
Simplify complex conditions:

java
// Instead of nested ifs, use logical operators:
if (age >= 18 && hasLicense && !isDrunk) {
    System.out.println("🚗 You can drive!");
}
🔍 Common Mistakes to Avoid
Using = instead of ==

java
if (age = 18)  // WRONG! ❌
if (age == 18) // CORRECT! ✅
Forgetting braces {}

java
if (condition)
    System.out.println("One line");  // This works
    System.out.println("Another");   // This always runs! ❌
Not covering all cases
Always think about what happens when ALL conditions are false!

✅ Day 4 Checklist
🧠 Understand if/else syntax

🔀 Practice multiple conditions with else if

🎨 Use nested if statements

[️] 🔗 Combine conditions with logical operators

🎯 Complete all exercises

🐛 Avoid common mistakes

💡 Pro Tip
Always test your conditions with different values to make sure all cases work as expected!

⬅️ Previous: Day 3 - Operators & Input | Next: Day 5 - Switch Statements ➡️