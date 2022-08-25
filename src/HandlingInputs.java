import java.util.Scanner;

public class HandlingInputs {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = reader.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = reader.nextLine();
        System.out.print("Enter you age: ");
        String age = reader.nextLine();
        System.out.println("Press enter to continue");
        reader.nextLine();
        int age1;
        age1 = Integer.parseInt(age);
        System.out.println("Your name is : " + firstName + " " + lastName +
                " your age next year is " + (age + 1));

    }
}
