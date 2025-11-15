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