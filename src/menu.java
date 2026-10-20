import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
    System.out.println("Type 1 to play Album Guesser. Type 2 to play Song Guesser.");
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
    
