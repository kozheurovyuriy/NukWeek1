package CountQuadrangle;

import java.util.List;

public interface Quadrangleable {
    double getSquare();
    double getPerimeter();
    boolean isQuadrate();
    boolean isRhombus();
    boolean isRectangle();
    boolean isRandomQuadrangle();
    long countOfQuadrate(List<QuadrangleImpl> quadrangleImplList);
    long countOfRhombus(List<QuadrangleImpl> quadrangleImplList);
    long countOfRectangle(List<QuadrangleImpl> quadrangleImplList);
    long countOfRandomQuadrangle(List<QuadrangleImpl> quadrangleImplList);
    double getSquareBiggestQuadrate(List<QuadrangleImpl> quadrangleImplList);
    double getSquareBiggestRhombus(List<QuadrangleImpl> quadrangleImplList);
    double getSquareBiggestRectangle(List<QuadrangleImpl> quadrangleImplList);
    double getSquareBiggestRandomQuadrangle(List<QuadrangleImpl> quadrangleImplList);
    double getSquareSmallestQuadrate(List<QuadrangleImpl> quadrangleImplList);
    double getSquareSmallestRhombus(List<QuadrangleImpl> quadrangleImplList);
    double getSquareSmallestRectangle(List<QuadrangleImpl> quadrangleImplList);
    double getSquareSmallestRandomQuadrangle(List<QuadrangleImpl> quadrangleImplList);
    double getPerimeterBiggestQuadrate(List<QuadrangleImpl> quadrangleImplList);
    double getPerimeterBiggestRhombus(List<QuadrangleImpl> quadrangleImplList);
    double getPerimeterBiggestRectangle(List<QuadrangleImpl> quadrangleImplList);
    double getPerimeterBiggestRandomQuadrangle(List<QuadrangleImpl> quadrangleImplList);
    double getPerimeterSmallestQuadrate(List<QuadrangleImpl> quadrangleImplList);
    double getPerimeterSmallestRhombus(List<QuadrangleImpl> quadrangleImplList);
    double getPerimeterSmallestRectangle(List<QuadrangleImpl> quadrangleImplList);
    double getPerimeterSmallestRandomQuadrangle(List<QuadrangleImpl> quadrangleImplList);
}
