
// 💻Day 2 Code Files:

//📄 Days/Day-02/Variables.java
//java
/**
 * Day 2: Variables & Data Types
 * Learning how to store and use different types of data
 */
public class Variables {
    public static void main(String[] args) {
        // 🎯 Integer variables (whole numbers)
        int studentAge = 20;
        int numberOfDays = 60;
        int javaVersion = 17;
        
        // 📊 Double variables (decimal numbers)
        double averageGrade = 85.5;
        double temperature = 36.6;
        double walletBalance = 99.99;
        
        // 🔤 Character variables (single characters)
        char firstInitial = 'A';
        char gradeSymbol = 'A';
        char currencySymbol = '$';
        
        // ✅ Boolean variables (true/false)
        boolean isEnrolled = true;
        boolean hasCompleted = false;
        boolean isWeekend = true;
        
        // 📝 String variables (text)
        String studentName = "Alice Johnson";
        String courseName = "Java Programming";
        String learningGoal = "Become a Java Developer";
        
        // 🖨️ Displaying all variables
        System.out.println("🎓 STUDENT PROFILE");
        System.out.println("👤 Name: " + studentName);
        System.out.println("🎯 Age: " + studentAge);
        System.out.println("📊 Average Grade: " + averageGrade);
        System.out.println("💵 Wallet: " + currencySymbol + walletBalance);
        System.out.println("📚 Course: " + courseName);
        System.out.println("🎯 Goal: " + learningGoal);
        System.out.println("✅ Enrolled: " + isEnrolled);
        System.out.println("🏁 Completed: " + hasCompleted);
        System.out.println("🔤 Initial: " + firstInitial);
        System.out.println("⭐ Grade: " + gradeSymbol);
        
        // 🌡️ Additional examples
        System.out.println("\n🌡️ ADDITIONAL INFO");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Java Version: " + javaVersion);
        System.out.println("Course Duration: " + numberOfDays + " days");
        System.out.println("Weekend: " + isWeekend);
        
        // 🔄 Type Casting Examples
        System.out.println("\n🔄 TYPE CASTING EXAMPLES");
        double decimalNumber = 9.99;
        int wholeNumber = (int) decimalNumber;  // Convert double to int
        System.out.println("Original decimal: " + decimalNumber);
        System.out.println("Converted to int: " + wholeNumber);
    }
}