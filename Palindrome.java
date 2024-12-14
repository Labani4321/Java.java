import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
 
        String cleanedInput = input.replaceAll("[^a-z A-Z]", "").toLowerCase();
 
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();
 
        if (cleanedInput.equals(reversedInput)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();
    }
}

