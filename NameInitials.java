// Java program to print the initials of your name.input : John David Smith Output : J.D.S.
import java.util.Scanner;

public class NameInitials{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                                                                                         
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
                                                                                                                   
        String[] nameParts = fullName.split(" ");
                                                                                                                          
        System.out.print("Initials: ");
        for (String part : nameParts) {
            if (!part.isEmpty()) {
                System.out.print(part.charAt(0) + ".");                                                   
            }
        }

        scanner.close();
    }
}


