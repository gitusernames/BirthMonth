import java.util.Scanner;

public class BirthMonth {
    static void main() {
        int birthMonth;
        String trash;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your birth month from 1-12: ");
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        } else {
            trash = in.nextLine();
            System.out.println("You said your birth month was: " + trash);
            System.out.println("Run the program again and enter a valid value!");
        }
    }
}
