import java.util.Scanner;

public class albumguesser {
public static void main(String[] args) {
System.out.println("Welcome to Album Guesser!");
System.out.println("Choose a Genre: 1. Pop 2. Rock 3. Hip-Hop 4. Country");
    Scanner input = new Scanner(System.in);
    int choice = input.nextInt();

if (choice == 1){
    System.out.println("Queuing Album guesser");
    } else if (choice == 2){
        System.out.println("Queuing Song Guesser");
    } else if (choice == 3){
        System.out.println("Goodbye");
    } else {
        System.out.println("Game not found. Please try again.");
    }
    }
}


