import java.util.Scanner;

public class TakingAPath {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Would you like an apple or a piece of chocolate? ");
        System.out.println("Apple/Chocolate???");
        String answer = reader.nextLine().toLowerCase();
        System.out.println(answer);
        if (answer.equals("apple")){
            System.out.println("Here's your apple!");
        }
        else if (answer.equals("chocolate")){
            System.out.println("Here's your chocolate!");
        }
        else {
            System.out.println("Not in stock!");
        }

    }
}
