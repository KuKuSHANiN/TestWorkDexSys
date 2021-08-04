import org.w3c.dom.ls.LSOutput;

import java.util.*;

import static java.lang.Integer.parseInt;

public class CoordinatePoint {
    private final List<Point> points = new ArrayList<>();
    private double axisX;
    private double axisY;
    private static final List<Point> listPoint1 = new ArrayList<>();
    private static final List<Point> listPoint2 = new ArrayList<>();
    private static final List<Point> listPoint3 = new ArrayList<>();
    private static final List<Point> outOfListPoint = new ArrayList<>();


    public void addPoint(String points) throws PointCountException, PointTypeException {
        String[] pointsArrayString = points.split(" ");   // рзбиваем введенную строку на массив строк
        // создаем новый массив листов для записи в него массива строк , для удобства

        if (pointsArrayString.length % 2 != 0) {
            throw new PointCountException("Wrong number of points");
        }
        for (int i = 0; i < pointsArrayString.length; i = i + 2) {
            try {
                double X = Double.parseDouble(pointsArrayString[i]);
                double Y = Double.parseDouble(pointsArrayString[i + 1]);
                Point point = new Point(X, Y);
                this.points.add(point);
            } catch (NumberFormatException e) {
                System.out.println("Not enough points for coordinates. Tru again.");
                Scanner in = new Scanner(System.in);
                addPoint(in.nextLine());
            }
        }
        System.out.println(this.points);
    }


    public void print() {


        for (Point point : this.points) {
            this.axisX = point.getAxisX();
            this.axisY = point.getAxisY();
// Группа У=Х

            if (axisX >= axisY) {
                listPoint1.add(point);
            } else {
                outOfListPoint.add(point);
            }
        }
        if (listPoint1.isEmpty()) {
            System.out.println("Group 1 is empty");
        } else System.out.println("Check point task 1 : " + listPoint1);

//Группа У=Х^2

        for (Point value : this.points) {
            if (axisY <= axisX * axisX) {
                listPoint2.add(value);
                System.out.println(axisX);
            } else if
            (outOfListPoint.contains(value)) {
                System.out.println("This point already in");
            } else outOfListPoint.add(value);
        }
        if (listPoint2.isEmpty()) {
            System.out.println("Group 2 is empty");
        } else System.out.println("Check point task 2 : " + listPoint2);

// Группа У=Х^3

        for (Point point : this.points) {
            if (axisY <= axisX * axisX * axisX) {
                listPoint3.add(point);
            } else if
            (outOfListPoint.contains(point)) {
                System.out.println("This point already in");
            } else outOfListPoint.add(point);
        }
        if (listPoint3.isEmpty()) {
            System.out.println("Group 1 is empty");
        } else System.out.println("Check point task 1 : " + listPoint3);


        System.out.println("Check point task 3 : " + listPoint3.toString());
        System.out.println("Uncheck point : " + outOfListPoint.toString());

    }

    public void print(String group) {
        String[] groupNum = group.split(" ");
        for (String s : groupNum) {
            int Num = parseInt(s);

            switch (Num) {
                case 1 -> System.out.println(this.listPoint1);
                case 2 -> System.out.println(this.listPoint2);
                case 3 -> System.out.println(this.listPoint3);
            }
        }
        System.out.println("Done");
    }

    public void remove(String group) {
        String[] groupNum = group.split(" ");
        for (String s : groupNum) {
            int Num = parseInt(s);

            switch (Num) {
                case 1 -> listPoint1.clear();
                case 2 -> listPoint2.clear();
                case 3 -> listPoint3.clear();
            }
        }
        System.out.println("Done");
    }

    public void clear() {

        listPoint1.clear();
        listPoint2.clear();
        listPoint3.clear();
        System.out.println("Done");
    }

    public void help() {
        System.out.println("Program operates with the coordinates of points checking them " +
                "for belonging to the conditions Y=X; Y=X^2; Y=X^3");
        System.out.println("1. add point - adds coordinate points from your console in next order: 1 2 3 4 " +
                "it means X1,Y1 = (1,2); X2,Y2 = (3,4); AND NO LETTERS  ");
        System.out.println("2. print - prints all the coordinates of the points line by line " +
                "first line - y=x" +
                "second line - y=x^2" +
                "third line - y=x^3" +
                "fourth line - points are not included in any group");
        System.out.println("3. print <group num> - prints coordinates of points from the selected group ");
        System.out.println("4. remove <group num> - delete coordinates point from the selected group ");
        System.out.println("5. clear - delete all point from all groups");
        System.out.println("6. help - it's too easy");
    }
}

////            List<String> onePoint = Arrays.asList(pointsArrayString);
//
//        Map<Integer, ArrayList<String>> memoryPoint = new HashMap<>();     // создаем хэшмапу , для того, чтобы группировать по ключу пары координат
//        for (int i = 0; i < onePoint.size() / 2; i++) {                       // например 1 (key) ( 3, 5) (value)
//            ArrayList<String> pairPoints = new ArrayList<>();
//            pairPoints.add(onePoint.get(2 * i));
//            pairPoints.add(onePoint.get(2 * i + 1));
//            memoryPoint.put(i, pairPoints);                                 //добавляем в хэшмап пары точек, и по ключу вызываем их
//            // сделано для удобства и неогрначености точек в памяти и их удаления
//        }
//
//
//        System.out.println(memoryPoint.get(4));
//        // в итоге получаем хэшмап , где под каждым ключем , начиная с 0
//    }                                                                       // лежит пара координат X и Y;
//}

