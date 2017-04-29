package CountQuadrangle;

import java.util.List;

public interface Quadrangleable {
    double getSquare();
    double getPerimeter();
    boolean isQuadrate();
    boolean isRhombus();
    boolean isRectangle();
    boolean isRandomQuadrangle();
    long countOfQuadrate(List<Quadrangleable> quadrangleImplList);
    long countOfRhombus(List<Quadrangleable> quadrangleImplList);
    long countOfRectangle(List<Quadrangleable> quadrangleImplList);
    long countOfRandomQuadrangle(List<Quadrangleable> quadrangleImplList);
    double getSquareBiggestQuadrate(List<Quadrangleable> quadrangleImplList);
    double getSquareBiggestRhombus(List<Quadrangleable> quadrangleImplList);
    double getSquareBiggestRectangle(List<Quadrangleable> quadrangleImplList);
    double getSquareBiggestRandomQuadrangle(List<Quadrangleable> quadrangleImplList);
    double getSquareSmallestQuadrate(List<Quadrangleable> quadrangleImplList);
    double getSquareSmallestRhombus(List<Quadrangleable> quadrangleImplList);
    double getSquareSmallestRectangle(List<Quadrangleable> quadrangleImplList);
    double getSquareSmallestRandomQuadrangle(List<Quadrangleable> quadrangleImplList);
    double getPerimeterBiggestQuadrate(List<Quadrangleable> quadrangleImplList);
    double getPerimeterBiggestRhombus(List<Quadrangleable> quadrangleImplList);
    double getPerimeterBiggestRectangle(List<Quadrangleable> quadrangleImplList);
    double getPerimeterBiggestRandomQuadrangle(List<Quadrangleable> quadrangleImplList);
    double getPerimeterSmallestQuadrate(List<Quadrangleable> quadrangleImplList);
    double getPerimeterSmallestRhombus(List<Quadrangleable> quadrangleImplList);
    double getPerimeterSmallestRectangle(List<Quadrangleable> quadrangleImplList);
    double getPerimeterSmallestRandomQuadrangle(List<Quadrangleable> quadrangleImplList);
}
