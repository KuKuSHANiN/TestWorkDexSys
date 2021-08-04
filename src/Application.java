import java.util.Scanner;
import java.util.zip.CheckedOutputStream;


public class Application {

    public static void start() throws PointCountException, PointTypeException {
//        int userChoice = ConsoleWorker.getCommandFromUser();
        ConsoleWorker.selectProgram(ConsoleWorker.getCommandFromUser());
        start();


    }
}
