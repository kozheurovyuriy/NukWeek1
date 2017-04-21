package CountQuadrangle;

import java.util.List;

public interface Quadrangleable {
    double getSquare();
    double getPerimeter();
    boolean isQuadrate();
    boolean isRhombus();
    boolean isRectangle();
    boolean isRandomQuadrangle();
    long countOfQuadrate(List<Quadrangle> quadrangleList);
    long countOfRhombus(List<Quadrangle> quadrangleList);
    long countOfRectangle(List<Quadrangle> quadrangleList);
    long countOfRandomQuadrangle(List<Quadrangle> quadrangleList);
    double getSquareBiggestQuadrate(List<Quadrangle> quadrangleList);
    double getSquareBiggestRhombus(List<Quadrangle> quadrangleList);
    double getSquareBiggestRectangle(List<Quadrangle> quadrangleList);
    double getSquareBiggestRandomQuadrangle(List<Quadrangle> quadrangleList);
    double getSquareSmallestQuadrate(List<Quadrangle> quadrangleList);
    double getSquareSmallestRhombus(List<Quadrangle> quadrangleList);
    double getSquareSmallestRectangle(List<Quadrangle> quadrangleList);
    double getSquareSmallestRandomQuadrangle(List<Quadrangle> quadrangleList);
    double getPerimeterBiggestQuadrate(List<Quadrangle> quadrangleList);
    double getPerimeterBiggestRhombus(List<Quadrangle> quadrangleList);
    double getPerimeterBiggestRectangle(List<Quadrangle> quadrangleList);
    double getPerimeterBiggestRandomQuadrangle(List<Quadrangle> quadrangleList);
    double getPerimeterSmallestQuadrate(List<Quadrangle> quadrangleList);
    double getPerimeterSmallestRhombus(List<Quadrangle> quadrangleList);
    double getPerimeterSmallestRectangle(List<Quadrangle> quadrangleList);
    double getPerimeterSmallestRandomQuadrangle(List<Quadrangle> quadrangleList);
}
