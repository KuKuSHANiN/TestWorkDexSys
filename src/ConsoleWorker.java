import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleWorker {

    public static int getCommandFromUser() {
        printMenu();
        Scanner in = new Scanner(System.in);

        int userChoice = 0;
        try {
            userChoice = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Should enter int value");
            getCommandFromUser();
//            in.close();
        }
        return userChoice;

    }

    public static String getNumsOfTasks() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static String enterPoints() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private static void printMenu() {
        System.out.println("Please enter the command number:");
        System.out.println("1. add point");
        System.out.println("2. print");
        System.out.println("3. print <group num>");
        System.out.println("4. remove <group num>");
        System.out.println("5. clear");
        System.out.println("6. help");
    }

}
