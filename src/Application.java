import java.util.Scanner;
import java.util.zip.CheckedOutputStream;


public class Application {

    public static void start() throws PointCountException, PointTypeException {

        switch (ConsoleWorker.getCommandFromUser()) {
            case 1:
                System.out.println("Please add point in memory");
                PointOperations.addPoint(ConsoleWorker.enterPoints());
                System.out.println("Done");
                break;
            case 2:
                System.out.println("Print all points");
                PointOperations.print();
                System.out.println("That's all");
                break;
            case 3:
                PointOperations.print(ConsoleWorker.getNumsOfTasks());
                System.out.println("Done");
                break;
            case 4:
                PointOperations.remove(ConsoleWorker.getNumsOfTasks());
                break;
            case 5:
                PointOperations.clear();
                break;
            case 6:
                PointOperations.help();
                break;
            default:
                break;

        }
        start();


    }
}
