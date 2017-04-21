package CountQuadrangle;

import java.util.ArrayList;
import java.util.List;

/*
Определить класс Четырехугольник на плоскости, вершины которого имеют тип Точка
Определить площадь и периметр четырехугольника.
Создать массив/список/множество объектов и подсчитать количество четырехугольников
разного типа (квадрат,прямоугольник, ромб, произвольный). Определить для
каждой группы наибольший и наименьший по площади (периметру) объект.
*/

public class Main {

    public static void main(String[] args) {

        List<Quadrangle> quadrangleList = new ArrayList<>();

        Point firstPoint = new Point(-10, 3); //RandomQuadrangle
        Point secondPoint = new Point(2, 5);
        Point thirdPoint = new Point(3, 3);
        Point fouthPoint = new Point(2, 2);

        Quadrangle quadrangle = new Quadrangle(firstPoint, secondPoint, thirdPoint, fouthPoint);

        quadrangleList.add(quadrangle); //RandomQuadrangle

        quadrangleList.add(new Quadrangle( //Quadrate with minSquare = 1
                new Point(1, 2),
                new Point(2, 2),
                new Point(2, 1),
                new Point(1, 1))
        );

        quadrangleList.add(new Quadrangle( //Rectangle
                new Point(1, 4),
                new Point(6, 4),
                new Point(6, 2),
                new Point(1, 2))
        );

        quadrangleList.add(new Quadrangle( //Quadrate
                new Point(4, 3),
                new Point(6, 3),
                new Point(6, 1),
                new Point(4, 1))
        );

        quadrangleList.add(new Quadrangle( //Quadrate
                new Point(1, 4),
                new Point(4, 4),
                new Point(4, 1),
                new Point(1, 1))
        );

        quadrangleList.add(new Quadrangle( //Quadrate with maxSquare = 36
                new Point(1, 1),
                new Point(1, 7),
                new Point(7, 7),
                new Point(7, 1))
        );

        quadrangleList.add(new Quadrangle( //Rhombus
                new Point(1, 3),
                new Point(2, 5),
                new Point(3, 3),
                new Point(2, 1))
        );

        quadrangleList.add(new Quadrangle( //RandomQuadrangle
                new Point(1, 4),
                new Point(2, 5),
                new Point(3, 3),
                new Point(2, 1))
        );

        quadrangleList.add(new Quadrangle( //RandomQuadrangle
                new Point(-1, 4),
                new Point(2, 5),
                new Point(3, -3),
                new Point(-2, -1))
        );

        System.out.println("Square first figure = " + quadrangle.getSquare());
        System.out.println("Perimeter first figure = " + quadrangle.getPerimeter());

        System.out.println("\nIs Quadrate = " + quadrangle.isQuadrate());
        System.out.println("Is Rhombus = " + quadrangle.isRhombus());
        System.out.println("Is Rectangle = " + quadrangle.isRectangle());
        System.out.println("Is RandomQuadrangle = " + quadrangle.isRandomQuadrangle());

        System.out.println("\nCount of Quadrate = " + quadrangle.countOfQuadrate(quadrangleList));
        System.out.println("Count of Rhombus = " + quadrangle.countOfRhombus(quadrangleList));
        System.out.println("Count of Rectangle = " + quadrangle.countOfRectangle(quadrangleList));
        System.out.println("Count of RandomQuadrangle = " + quadrangle.countOfRandomQuadrangle(quadrangleList));

        System.out.println("\nMax square of Quadrate = " + quadrangle.getSquareBiggestQuadrate(quadrangleList));
        System.out.println("Max square of Rhombus = " + quadrangle.getSquareBiggestRhombus(quadrangleList));
        System.out.println("Max square of Rectangle = " + quadrangle.getSquareBiggestRectangle(quadrangleList));
        System.out.println("Max square of RandomQuadrangle = " + quadrangle.getSquareBiggestRandomQuadrangle(quadrangleList));

        System.out.println("\nMin square of Quadrate = " + quadrangle.getSquareSmallestQuadrate(quadrangleList));
        System.out.println("Min square of Rhombus = " + quadrangle.getSquareSmallestRhombus(quadrangleList));
        System.out.println("Min square of Rectangle = " + quadrangle.getSquareSmallestRectangle(quadrangleList));
        System.out.println("Min square of RandomQuadrangle = " + quadrangle.getSquareSmallestRandomQuadrangle(quadrangleList));

        System.out.println("\nMax Perimeter of Quadrate = " + quadrangle.getPerimeterBiggestQuadrate(quadrangleList));
        System.out.println("Max Perimeter of Rhombus = " + quadrangle.getPerimeterBiggestRhombus(quadrangleList));
        System.out.println("Max Perimeter of Rectangle = " + quadrangle.getPerimeterBiggestRectangle(quadrangleList));
        System.out.println("Max Perimeter of RandomQuadrangle = " + quadrangle.getPerimeterBiggestRandomQuadrangle(quadrangleList));

        System.out.println("\nMin Perimeter of Quadrate = " + quadrangle.getPerimeterSmallestQuadrate(quadrangleList));
        System.out.println("Min Perimeter of Rhombus = " + quadrangle.getPerimeterSmallestRhombus(quadrangleList));
        System.out.println("Min Perimeter of Rectangle = " + quadrangle.getPerimeterSmallestRectangle(quadrangleList));
        System.out.println("Min Perimeter of RandomQuadrangle = " + quadrangle.getPerimeterSmallestRandomQuadrangle(quadrangleList));

    }
}
