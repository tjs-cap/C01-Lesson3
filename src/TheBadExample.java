import java.util.Scanner;

public class TheBadExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String x = reader.nextLine();
        System.out.println("Enter another number: ");
//        String y = reader.nextLine();
        int y = reader.nextInt();
        System.out.println(Integer.parseInt(x) + y);
        // add the two numbers
    }
}
