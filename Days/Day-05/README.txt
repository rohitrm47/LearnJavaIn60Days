# Day 5: Switch Statements & Loops 🔄

## 🎯 Today's Goals
- ✅ Master switch statements for multiple conditions
- ✅ Understand for loops for repeated tasks
- ✅ Learn while and do-while loops
- ✅ Practice loop control with break and continue
- ✅ Build programs with repetition and menus

## 🔀 Switch Statements

Switch statements are perfect when you have multiple conditions based on the same variable!

### Basic Syntax:
```java
switch (variable) {
    case value1:
        // Code for value1
        break;
    case value2:
        // Code for value2
        break;
    default:
        // Code if no cases match
}
```

## 💻 Switch Examples

### Day of Week:
```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("📅 Monday");
        break;
    case 2:
        System.out.println("📅 Tuesday");
        break;
    case 3:
        System.out.println("📅 Wednesday");
        break;
    case 4:
        System.out.println("📅 Thursday");
        break;
    case 5:
        System.out.println("📅 Friday");
        break;
    case 6:
        System.out.println("📅 Saturday");
        break;
    case 7:
        System.out.println("📅 Sunday");
        break;
    default:
        System.out.println("❌ Invalid day");
}
```

### Grade System:
```java
char grade = 'B';

switch (grade) {
    case 'A':
        System.out.println("🎯 Excellent!");
        break;
    case 'B':
        System.out.println("🎯 Good job!");
        break;
    case 'C':
        System.out.println("🎯 Well done");
        break;
    case 'D':
        System.out.println("🎯 You passed");
        break;
    case 'F':
        System.out.println("🎯 Better try again");
        break;
    default:
        System.out.println("❌ Invalid grade");
}
```

## 🔄 Loops - For, While, Do-While

### For Loop:
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("🚀 Count: " + i);
}
```

### While Loop:
```java
int count = 1;
while (count <= 5) {
    System.out.println("🔢 While count: " + count);
    count++;
}
```

### Do-While Loop:
```java
int number = 1;
do {
    System.out.println("🔄 Do-While: " + number);
    number++;
} while (number <= 5);
```

## 🎯 Exercises

### Exercise 1: Simple Calculator with Switch
Create a calculator that takes two numbers and an operator (+, -, *, /) and performs the operation using switch statement.

### Exercise 2: Number Pyramid
Use nested for loops to create this pattern:
```
1
12
123
1234
12345
```

### Exercise 3: Multiplication Table
Generate multiplication table for a number using for loop.

### Exercise 4: Number Guessing Game
Use while loop to let user guess a number between 1-10 with hints.

### Exercise 5: Menu System
Create a program with menu using switch:
1. Check even/odd
2. Check positive/negative  
3. Exit

## ⚡ Loop Control Statements

### Break Statement:
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // Exit loop when i is 5
    }
    System.out.println(i);
}
```

### Continue Statement:
```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue; // Skip even numbers
    }
    System.out.println("Odd: " + i);
}
```

## 🎨 Advanced Examples

### Nested Loops Pattern:
```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("⭐");
    }
    System.out.println();
}
```

### Infinite Loop with Break:
```java
int number;
while (true) {
    System.out.print("Enter a number (0 to exit): ");
    number = scanner.nextInt();
    
    if (number == 0) {
        break; // Exit infinite loop
    }
    System.out.println("You entered: " + number);
}
```

## 🔍 Common Mistakes to Avoid

1. **Forgetting break in switch:**
   ```java
   case 'A':
       System.out.println("Excellent");
       // Missing break - will fall through to next case! ❌
   case 'B':
       System.out.println("Good");
       break;
   ```

2. **Infinite loops:**
   ```java
   while (true) {
       // Always true - infinite loop! ❌
       // Need break condition inside
   }
   ```

3. **Wrong loop condition:**
   ```java
   for (int i = 0; i < 5; i--) {
       // i-- makes i smaller - infinite loop! ❌
   }
   ```

## ✅ Day 5 Checklist
- [ ] 🔀 Master switch statements with break
- [ ] 🔄 Understand for, while, and do-while loops
- [ ] ⚡ Use break and continue effectively
- [ ] 🎨 Create patterns with nested loops
- [ ] 🎯 Complete all exercises
- [ ] 🎮 Build interactive menu systems

## 💡 Pro Tip
Use switch for multiple conditions on the same variable, and if-else for complex conditions involving different variables!

---

**⬅️ [Previous: Day 4 - If/Else Statements](../Day-04/README.md)** | **Next: [Day 6 - Arrays ➡️](../Day-06/README.md)**

**🔄 Your programs can now repeat tasks and handle multiple choices efficiently! This is a huge step forward!**