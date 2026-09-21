import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class test {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        File file = new File("Class.txt");
        scanner.close();
        scanner = new Scanner(file);
        String course = scanner.nextLine();
        System.out.println("Welcome to " + course + "!");
        scanner.close(); // hello there
    }
}