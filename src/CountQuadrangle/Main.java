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

        List<QuadrangleImpl> quadrangleImplList = new ArrayList<>();

        Point firstPoint = new Point(-10, 3); //RandomQuadrangle
        Point secondPoint = new Point(2, 5);
        Point thirdPoint = new Point(3, 3);
        Point fouthPoint = new Point(2, 2);

        QuadrangleImpl quadrangleImpl = new QuadrangleImpl(firstPoint, secondPoint, thirdPoint, fouthPoint);

        quadrangleImplList.add(quadrangleImpl); //RandomQuadrangle

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

        System.out.println("Square first figure = " + quadrangleImpl.getSquare());
        System.out.println("Perimeter first figure = " + quadrangleImpl.getPerimeter());

        System.out.println("\nIs Quadrate = " + quadrangleImpl.isQuadrate());
        System.out.println("Is Rhombus = " + quadrangleImpl.isRhombus());
        System.out.println("Is Rectangle = " + quadrangleImpl.isRectangle());
        System.out.println("Is RandomQuadrangle = " + quadrangleImpl.isRandomQuadrangle());

        System.out.println("\nCount of Quadrate = " + quadrangleImpl.countOfQuadrate(quadrangleImplList));
        System.out.println("Count of Rhombus = " + quadrangleImpl.countOfRhombus(quadrangleImplList));
        System.out.println("Count of Rectangle = " + quadrangleImpl.countOfRectangle(quadrangleImplList));
        System.out.println("Count of RandomQuadrangle = " + quadrangleImpl.countOfRandomQuadrangle(quadrangleImplList));

        System.out.println("\nMax square of Quadrate = " + quadrangleImpl.getSquareBiggestQuadrate(quadrangleImplList));
        System.out.println("Max square of Rhombus = " + quadrangleImpl.getSquareBiggestRhombus(quadrangleImplList));
        System.out.println("Max square of Rectangle = " + quadrangleImpl.getSquareBiggestRectangle(quadrangleImplList));
        System.out.println("Max square of RandomQuadrangle = " + quadrangleImpl.getSquareBiggestRandomQuadrangle(quadrangleImplList));

        System.out.println("\nMin square of Quadrate = " + quadrangleImpl.getSquareSmallestQuadrate(quadrangleImplList));
        System.out.println("Min square of Rhombus = " + quadrangleImpl.getSquareSmallestRhombus(quadrangleImplList));
        System.out.println("Min square of Rectangle = " + quadrangleImpl.getSquareSmallestRectangle(quadrangleImplList));
        System.out.println("Min square of RandomQuadrangle = " + quadrangleImpl.getSquareSmallestRandomQuadrangle(quadrangleImplList));

        System.out.println("\nMax Perimeter of Quadrate = " + quadrangleImpl.getPerimeterBiggestQuadrate(quadrangleImplList));
        System.out.println("Max Perimeter of Rhombus = " + quadrangleImpl.getPerimeterBiggestRhombus(quadrangleImplList));
        System.out.println("Max Perimeter of Rectangle = " + quadrangleImpl.getPerimeterBiggestRectangle(quadrangleImplList));
        System.out.println("Max Perimeter of RandomQuadrangle = " + quadrangleImpl.getPerimeterBiggestRandomQuadrangle(quadrangleImplList));

        System.out.println("\nMin Perimeter of Quadrate = " + quadrangleImpl.getPerimeterSmallestQuadrate(quadrangleImplList));
        System.out.println("Min Perimeter of Rhombus = " + quadrangleImpl.getPerimeterSmallestRhombus(quadrangleImplList));
        System.out.println("Min Perimeter of Rectangle = " + quadrangleImpl.getPerimeterSmallestRectangle(quadrangleImplList));
        System.out.println("Min Perimeter of RandomQuadrangle = " + quadrangleImpl.getPerimeterSmallestRandomQuadrangle(quadrangleImplList));

    }
}
