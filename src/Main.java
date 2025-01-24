import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    //MAD TEXT GAME

    Scanner scanner = new Scanner(System.in);

    String adjective1;
    String noun1;
    String adjective2;
    String verb1;
    String adjective3;
    String substantive1;

    System.out.println("Enter an adjective (description): ");
    adjective1 = scanner.nextLine();
    System.out.println("Enter a noun (animal or person): ");
    noun1 = scanner.nextLine();
    System.out.println("Enter an adjective (description): ");
    adjective2 = scanner.nextLine();
    System.out.println("Enter a verb end with -ing (action): ");
    verb1 = scanner.nextLine();
    System.out.println("Enter an adjective (description): ");
    adjective3 = scanner.nextLine();
    System.out.println("Enter a substantive (opinion): ");
    substantive1 = scanner.nextLine();

    System.out.println("Today i went to a " + adjective1 + " mall");
    System.out.println("To see my friend " + noun1);
    System.out.println("She's such a nice person and has a " + adjective2 + " laugh");
    System.out.println("I found her " + verb1 + " new clothes in one of the stores");
    System.out.println("She showed me a " + adjective3 + " jacket that she liked");
    System.out.println("After telling me to wait outside the changing room, she comes back wearing the black jacket asking me what did i think, i said: " + substantive1);

    scanner.close();

    }
}