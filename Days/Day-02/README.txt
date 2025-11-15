# Day 2: Variables & Data Types 📊

## 🎯 Today's Goals
- ✅ Understand what variables are
- ✅ Learn different data types in Java
- ✅ Practice declaring and using variables
- ✅ Learn about type casting

## 💡 What are Variables?
Variables are like **containers** that store data in your program. Think of them as labeled boxes where you can put information!

## 📦 Java Data Types

### Primitive Data Types:
| Type | Size | Stores | Example |
|------|------|--------|---------|
| `int` | 4 bytes | Whole numbers | `int age = 25;` |
| `double` | 8 bytes | Decimal numbers | `double price = 19.99;` |
| `char` | 2 bytes | Single character | `char grade = 'A';` |
| `boolean` | 1 bit | true/false | `boolean isJavaFun = true;` |
| `String` | varies | Text | `String name = "John";` |

*Note: String is not primitive but we use it like one!*

## 💻 Code Examples

### Basic Variable Declaration:
```java
public class Variables {
    public static void main(String[] args) {
        // Integer variables (whole numbers)
        int studentAge = 20;
        int numberOfDays = 60;
        
        // Double variables (decimal numbers)
        double averageGrade = 85.5;
        double temperature = 36.6;
        
        // Character variables (single characters)
        char firstInitial = 'A';
        char gradeSymbol = 'A';
        
        // Boolean variables (true/false)
        boolean isEnrolled = true;
        boolean hasCompleted = false;
        
        // String variables (text)
        String studentName = "Alice";
        String courseName = "Java Programming";
        
        // Displaying variables
        System.out.println("👤 Student: " + studentName);
        System.out.println("🎯 Age: " + studentAge);
        System.out.println("📊 Average Grade: " + averageGrade);
        System.out.println("📚 Course: " + courseName);
        System.out.println("✅ Enrolled: " + isEnrolled);
    }
}


Variable Naming Rules:
✅ Must start with letter or _ or $

✅ Can contain numbers, but not start with them

✅ Case sensitive (age ≠ Age)

✅ Use camelCase (studentName, not student_name)

🎯 Exercises
Exercise 1: Personal Profile
Create variables to store your:

Name

Age

Favorite number

Whether you like programming (true/false)

First letter of your name

Exercise 2: Simple Calculator
Create variables for:

Two numbers

Their sum, difference, product, and quotient

Display all results

🔄 Type Casting
Sometimes you need to convert between types:

java
// Widening casting (automatic)
int myInt = 9;
double myDouble = myInt;  // Automatic: int to double

// Narrowing casting (manual)  
double myDouble = 9.78;
int myInt = (int) myDouble;  // Manual: double to int
✅ Day 2 Checklist
📊 Understand different data types

💻 Declare and use variables

🎯 Complete both exercises

🔄 Practice type casting

📝 Review variable naming rules

💡 Pro Tip
Use meaningful variable names! studentAge is better than sa because it's clear what it stores.