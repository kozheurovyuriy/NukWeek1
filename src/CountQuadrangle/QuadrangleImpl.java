package CountQuadrangle;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class QuadrangleImpl implements Quadrangleable{

    private Point firstPoint, secondPoint, thirdPoint, fouthPoint;

    public QuadrangleImpl(Point firstPoint, Point secondPoint, Point thirdPoint, Point fouthPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
        this.fouthPoint = fouthPoint;
    }

    @Override
    public double getSquare() {
        return (
                ((firstPoint.getY() + secondPoint.getY()) * (secondPoint.getX() - firstPoint.getX())) +
                ((secondPoint.getY() + thirdPoint.getY()) * (thirdPoint.getX() - secondPoint.getX())) +
                ((thirdPoint.getY() + fouthPoint.getY()) * (fouthPoint.getX() - thirdPoint.getX())) +
                ((fouthPoint.getY() + firstPoint.getY()) * (firstPoint.getX() - fouthPoint.getX()))
        ) / 2;
    }

    @Override
    public double getPerimeter() {
        return (getSegmentLength(firstPoint, secondPoint) + getSegmentLength(firstPoint, fouthPoint))
                + getSegmentLength(secondPoint, thirdPoint) + getSegmentLength(thirdPoint, fouthPoint);
    }

    @Override
    public boolean isQuadrate() {
        return (getSegmentLength(firstPoint, secondPoint) == getSegmentLength(firstPoint, fouthPoint) &&
                getSegmentLength(secondPoint, thirdPoint) == getSegmentLength(firstPoint, secondPoint) &&
                getSegmentLength(secondPoint, thirdPoint) == getSegmentLength(thirdPoint, fouthPoint) &&
                getSegmentLength(thirdPoint, fouthPoint) == getSegmentLength(firstPoint, fouthPoint))
                && getSquare() == Math.pow(getSegmentLength(firstPoint, secondPoint), 2);
    }

    @Override
    public boolean isRhombus() {
        return (getSegmentLength(firstPoint, secondPoint) == getSegmentLength(firstPoint, fouthPoint) &&
                getSegmentLength(secondPoint, thirdPoint) == getSegmentLength(firstPoint, secondPoint) &&
                getSegmentLength(secondPoint, thirdPoint) == getSegmentLength(thirdPoint, fouthPoint) &&
                getSegmentLength(thirdPoint, fouthPoint) == getSegmentLength(firstPoint, fouthPoint))
                && getSquare() < Math.pow(getSegmentLength(firstPoint, secondPoint), 2);
    }

    @Override
    public boolean isRectangle() {
        return (getSegmentLength(firstPoint, secondPoint) * getSegmentLength(firstPoint, fouthPoint) ==
                getSquare()) && getSegmentLength(firstPoint, secondPoint) != getSegmentLength(firstPoint, fouthPoint);
    }

    @Override
    public boolean isRandomQuadrangle() {
        return !isRectangle() && !isQuadrate() && !isRhombus();
    }

    @Override
    public long countOfQuadrate(List<Quadrangleable> quadrangleImplList){
        return quadrangleImplList.stream().filter(Quadrangleable::isQuadrate).count();
    }

    @Override
    public long countOfRhombus(List<Quadrangleable> quadrangleImplList){
        return quadrangleImplList.stream().filter(Quadrangleable::isRhombus).count();
    }

    @Override
    public long countOfRectangle(List<Quadrangleable> quadrangleImplList){
        return quadrangleImplList.stream().filter(Quadrangleable::isRectangle).count();
    }

    @Override
    public long countOfRandomQuadrangle(List<Quadrangleable> quadrangleImplList){
        return quadrangleImplList.stream().filter(Quadrangleable::isRandomQuadrangle).count();
    }

    @Override
    public double getSquareBiggestQuadrate(List<Quadrangleable> quadrangleImplList) {
        Optional<Quadrangleable> max = quadrangleImplList.stream()
                .filter(Quadrangleable::isQuadrate)
                .max(Comparator.comparing(Quadrangleable::getSquare));
        return max.map(Quadrangleable::getSquare).orElse(0.0);
    }

    @Override
    public double getSquareBiggestRhombus(List<Quadrangleable> quadrangleImplList) {
        Optional<Quadrangleable> max = quadrangleImplList.stream()
                .filter(Quadrangleable::isRhombus)
                .max(Comparator.comparing(Quadrangleable::getSquare));
        return max.map(Quadrangleable::getSquare).orElse(0.0);
    }

    @Override
    public double getSquareBiggestRectangle(List<Quadrangleable> quadrangleImplList) {
        Optional<Quadrangleable> max = quadrangleImplList.stream()
                .filter(Quadrangleable::isRectangle)
                .max(Comparator.comparing(Quadrangleable::getSquare));
        return max.map(Quadrangleable::getSquare).orElse(0.0);
    }

    @Override
    public double getSquareBiggestRandomQuadrangle(List<Quadrangleable> quadrangleImplList) {
        Optional<Quadrangleable> max = quadrangleImplList.stream()
                .filter(Quadrangleable::isRandomQuadrangle)
                .max(Comparator.comparing(Quadrangleable::getSquare));
        return max.map(Quadrangleable::getSquare).orElse(0.0);
    }

    @Override
    public double getSquareSmallestQuadrate(List<Quadrangleable> quadrangleImplList) {
        Optional<Quadrangleable> min = quadrangleImplList.stream()
                .filter(Quadrangleable::isQuadrate)
                .min(Comparator.comparing(Quadrangleable::getSquare));
        return min.map(Quadrangleable::getSquare).orElse(0.0);
    }

    @Override
    public double getSquareSmallestRhombus(List<Quadrangleable> quadrangleImplList) {
        Optional<Quadrangleable> min = quadrangleImplList.stream()
                .filter(Quadrangleable::isRhombus)
                .min(Comparator.comparing(Quadrangleable::getSquare));
        return min.map(Quadrangleable::getSquare).orElse(0.0);    }

    @Override
    public double getSquareSmallestRectangle(List<Quadrangleable> quadrangleImplList) {
        Optional<Quadrangleable> min = quadrangleImplList.stream()
                .filter(Quadrangleable::isRectangle)
                .min(Comparator.comparing(Quadrangleable::getSquare));
        return min.map(Quadrangleable::getSquare).orElse(0.0);    }

    @Override
    public double getSquareSmallestRandomQuadrangle(List<Quadrangleable> quadrangleImplList) {
        Optional<Quadrangleable> min = quadrangleImplList.stream()
                .filter(Quadrangleable::isRandomQuadrangle)
                .min(Comparator.comparing(Quadrangleable::getSquare));
        return min.map(Quadrangleable::getSquare).orElse(0.0);    }

    @Override
    public double getPerimeterBiggestQuadrate(List<Quadrangleable> quadrangleImplList) {
        Optional<Quadrangleable> max = quadrangleImplList.stream()
                .filter(Quadrangleable::isQuadrate)
                .max(Comparator.comparing(Quadrangleable::getPerimeter));
        return max.map(Quadrangleable::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterBiggestRhombus(List<Quadrangleable> quadrangleImplList) {
        Optional<Quadrangleable> max = quadrangleImplList.stream()
                .filter(Quadrangleable::isRhombus)
                .max(Comparator.comparing(Quadrangleable::getPerimeter));
        return max.map(Quadrangleable::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterBiggestRectangle(List<Quadrangleable> quadrangleImplList) {
        Optional<Quadrangleable> max = quadrangleImplList.stream()
                .filter(Quadrangleable::isRectangle)
                .max(Comparator.comparing(Quadrangleable::getPerimeter));
        return max.map(Quadrangleable::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterBiggestRandomQuadrangle(List<Quadrangleable> quadrangleImplList) {
        Optional<Quadrangleable> max = quadrangleImplList.stream()
                .filter(Quadrangleable::isRandomQuadrangle)
                .max(Comparator.comparing(Quadrangleable::getPerimeter));
        return max.map(Quadrangleable::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterSmallestQuadrate(List<Quadrangleable> quadrangleImplList) {
        Optional<Quadrangleable> min = quadrangleImplList.stream()
                .filter(Quadrangleable::isQuadrate)
                .min(Comparator.comparing(Quadrangleable::getPerimeter));
        return min.map(Quadrangleable::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterSmallestRhombus(List<Quadrangleable> quadrangleImplList) {
        Optional<Quadrangleable> min = quadrangleImplList.stream()
                .filter(Quadrangleable::isRhombus)
                .min(Comparator.comparing(Quadrangleable::getPerimeter));
        return min.map(Quadrangleable::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterSmallestRectangle(List<Quadrangleable> quadrangleImplList) {
        Optional<Quadrangleable> min = quadrangleImplList.stream()
                .filter(Quadrangleable::isRectangle)
                .min(Comparator.comparing(Quadrangleable::getPerimeter));
        return min.map(Quadrangleable::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterSmallestRandomQuadrangle(List<Quadrangleable> quadrangleImplList) {
        Optional<Quadrangleable> min = quadrangleImplList.stream()
                .filter(Quadrangleable::isRandomQuadrangle)
                .min(Comparator.comparing(Quadrangleable::getPerimeter));
        return min.map(Quadrangleable::getPerimeter).orElse(0.0);
    }

    private double getSegmentLength(Point pointA, Point pointB){
        return Math.sqrt(Math.pow((pointB.getX() - pointA.getX()), 2) + Math.pow((pointB.getY() - pointA.getY()), 2));
    }
}
