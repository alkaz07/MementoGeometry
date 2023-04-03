//import geometry.Point;
import geometry.figures.*;
import geometry.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* exemple1();
        try {
            exemple2Circles();
        } catch (FileNotFoundException e) {
            System.out.println("problem with file");
        }*/
        exemple3();
    }

    private static void exemple2Circles() throws FileNotFoundException {
        String inputFilename = "input.txt";
        Scanner scan = new Scanner(new File(inputFilename));
        Circle okr1, okr2;
        int x = scan.nextInt();
        int y = scan.nextInt();
        int r = scan.nextInt();
        okr1 = new Circle(new Point(x, y), r);
        okr2 = new Circle(new Point(scan.nextInt(), scan.nextInt()), scan.nextInt());
        if(okr1.intersectWith(okr2))
            System.out.println("YES");
        else
            System.out.println("NO");

    }

    private static void exemple1() {
        Square kvadrat1 = new Square(10);
        kvadrat1.kva();

        Rectangle rec2 = new Square(12);

        System.out.println( rec2.getClass().getName());
        Point p1 = new Point(12, 14);
        System.out.println(p1.getClass().getName());

        Circle circ = new Circle(p1, 100);
        //обычный массив
        PlainFigure[] massiv = new PlainFigure[]{circ, rec2, kvadrat1};
        for (PlainFigure fig: massiv ) {
            System.out.println("площадь = "+fig.getArea());
            System.out.println(fig.kva());
        }
        //список
        List<PlainFigure> figureList = new ArrayList<PlainFigure>();

        figureList.add(rec2);
        figureList.add(circ);
        figureList.add(kvadrat1);
        for (PlainFigure elem: figureList) {
            System.out.println("периметр = "+elem.getPerimeter());
        }


    }

    public static void exemple3()
    {
        Square kvadrat1 = new Square(10);
        Rectangle rec2 = new Square(12);
        //rec2.meow();   not public
        kvadrat1.sayMeow();
    }
}
