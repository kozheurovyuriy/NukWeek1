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

        List<Quadrangleable> quadrangleImplList = new ArrayList<>();

        Point firstPoint = new Point(-10, 3); //RandomQuadrangle
        Point secondPoint = new Point(2, 5);
        Point thirdPoint = new Point(3, 3);
        Point fouthPoint = new Point(2, 2);

        Quadrangleable quadrangle = new QuadrangleImpl(firstPoint, secondPoint, thirdPoint, fouthPoint);

        quadrangleImplList.add(quadrangle); //RandomQuadrangle

        quadrangleImplList.add(new QuadrangleImpl( //Quadrate with minSquare = 1
                new Point(1, 2),
                new Point(2, 2),
                new Point(2, 1),
                new Point(1, 1))
        );

        quadrangleImplList.add(new QuadrangleImpl( //Rectangle
                new Point(1, 4),
                new Point(6, 4),
                new Point(6, 2),
                new Point(1, 2))
        );

        quadrangleImplList.add(new QuadrangleImpl( //Quadrate
                new Point(4, 3),
                new Point(6, 3),
                new Point(6, 1),
                new Point(4, 1))
        );

        quadrangleImplList.add(new QuadrangleImpl( //Quadrate
                new Point(1, 4),
                new Point(4, 4),
                new Point(4, 1),
                new Point(1, 1))
        );

        quadrangleImplList.add(new QuadrangleImpl( //Quadrate with maxSquare = 36
                new Point(1, 1),
                new Point(1, 7),
                new Point(7, 7),
                new Point(7, 1))
        );

        quadrangleImplList.add(new QuadrangleImpl( //Rhombus
                new Point(1, 3),
                new Point(2, 5),
                new Point(3, 3),
                new Point(2, 1))
        );

        quadrangleImplList.add(new QuadrangleImpl( //RandomQuadrangle
                new Point(1, 4),
                new Point(2, 5),
                new Point(3, 3),
                new Point(2, 1))
        );

        quadrangleImplList.add(new QuadrangleImpl( //RandomQuadrangle
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

        System.out.println("\nCount of Quadrate = " + quadrangle.countOfQuadrate(quadrangleImplList));
        System.out.println("Count of Rhombus = " + quadrangle.countOfRhombus(quadrangleImplList));
        System.out.println("Count of Rectangle = " + quadrangle.countOfRectangle(quadrangleImplList));
        System.out.println("Count of RandomQuadrangle = " + quadrangle.countOfRandomQuadrangle(quadrangleImplList));

        System.out.println("\nMax square of Quadrate = " + quadrangle.getSquareBiggestQuadrate(quadrangleImplList));
        System.out.println("Max square of Rhombus = " + quadrangle.getSquareBiggestRhombus(quadrangleImplList));
        System.out.println("Max square of Rectangle = " + quadrangle.getSquareBiggestRectangle(quadrangleImplList));
        System.out.println("Max square of RandomQuadrangle = " + quadrangle.getSquareBiggestRandomQuadrangle(quadrangleImplList));

        System.out.println("\nMin square of Quadrate = " + quadrangle.getSquareSmallestQuadrate(quadrangleImplList));
        System.out.println("Min square of Rhombus = " + quadrangle.getSquareSmallestRhombus(quadrangleImplList));
        System.out.println("Min square of Rectangle = " + quadrangle.getSquareSmallestRectangle(quadrangleImplList));
        System.out.println("Min square of RandomQuadrangle = " + quadrangle.getSquareSmallestRandomQuadrangle(quadrangleImplList));

        System.out.println("\nMax Perimeter of Quadrate = " + quadrangle.getPerimeterBiggestQuadrate(quadrangleImplList));
        System.out.println("Max Perimeter of Rhombus = " + quadrangle.getPerimeterBiggestRhombus(quadrangleImplList));
        System.out.println("Max Perimeter of Rectangle = " + quadrangle.getPerimeterBiggestRectangle(quadrangleImplList));
        System.out.println("Max Perimeter of RandomQuadrangle = " + quadrangle.getPerimeterBiggestRandomQuadrangle(quadrangleImplList));

        System.out.println("\nMin Perimeter of Quadrate = " + quadrangle.getPerimeterSmallestQuadrate(quadrangleImplList));
        System.out.println("Min Perimeter of Rhombus = " + quadrangle.getPerimeterSmallestRhombus(quadrangleImplList));
        System.out.println("Min Perimeter of Rectangle = " + quadrangle.getPerimeterSmallestRectangle(quadrangleImplList));
        System.out.println("Min Perimeter of RandomQuadrangle = " + quadrangle.getPerimeterSmallestRandomQuadrangle(quadrangleImplList));

    }
}
