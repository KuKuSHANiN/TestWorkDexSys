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

    private static String enterPoints() {
        Scanner in = new Scanner(System.in);
        String strPoint = in.nextLine();
        return strPoint;
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

    public static void selectProgram(int choice) throws PointCountException, PointTypeException {
        CoordinatePoint cp = new CoordinatePoint();
        Scanner in = new Scanner(System.in);
        switch (choice) {
            case 1:
                System.out.println("Please add point in memory");
                cp.addPoint(enterPoints());
                System.out.println("Done");
                break;
            case 2:
                System.out.println("Print all points");
                cp.print();
                System.out.println("That's all");
                break;
            case 3:
                cp.print(in.nextLine());
                System.out.println("Done");
                break;
            case 4:
                cp.remove(in.nextLine());
                break;
            case 5:
                cp.clear();
                break;
            case 6:
                cp.help();
                break;
            default:
                break;

        }

    }

}
