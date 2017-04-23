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
    public long countOfQuadrate(List<QuadrangleImpl> quadrangleImplList){
        return quadrangleImplList.stream().filter(QuadrangleImpl::isQuadrate).count();
    }

    @Override
    public long countOfRhombus(List<QuadrangleImpl> quadrangleImplList){
        return quadrangleImplList.stream().filter(QuadrangleImpl::isRhombus).count();
    }

    @Override
    public long countOfRectangle(List<QuadrangleImpl> quadrangleImplList){
        return quadrangleImplList.stream().filter(QuadrangleImpl::isRectangle).count();
    }

    @Override
    public long countOfRandomQuadrangle(List<QuadrangleImpl> quadrangleImplList){
        return quadrangleImplList.stream().filter(QuadrangleImpl::isRandomQuadrangle).count();
    }

    @Override
    public double getSquareBiggestQuadrate(List<QuadrangleImpl> quadrangleImplList) {
        Optional<QuadrangleImpl> max = quadrangleImplList.stream()
                .filter(QuadrangleImpl::isQuadrate)
                .max(Comparator.comparing(QuadrangleImpl::getSquare));
        return max.map(QuadrangleImpl::getSquare).orElse(0.0);
    }

    @Override
    public double getSquareBiggestRhombus(List<QuadrangleImpl> quadrangleImplList) {
        Optional<QuadrangleImpl> max = quadrangleImplList.stream()
                .filter(QuadrangleImpl::isRhombus)
                .max(Comparator.comparing(QuadrangleImpl::getSquare));
        return max.map(QuadrangleImpl::getSquare).orElse(0.0);
    }

    @Override
    public double getSquareBiggestRectangle(List<QuadrangleImpl> quadrangleImplList) {
        Optional<QuadrangleImpl> max = quadrangleImplList.stream()
                .filter(QuadrangleImpl::isRectangle)
                .max(Comparator.comparing(QuadrangleImpl::getSquare));
        return max.map(QuadrangleImpl::getSquare).orElse(0.0);
    }

    @Override
    public double getSquareBiggestRandomQuadrangle(List<QuadrangleImpl> quadrangleImplList) {
        Optional<QuadrangleImpl> max = quadrangleImplList.stream()
                .filter(QuadrangleImpl::isRandomQuadrangle)
                .max(Comparator.comparing(QuadrangleImpl::getSquare));
        return max.map(QuadrangleImpl::getSquare).orElse(0.0);
    }

    @Override
    public double getSquareSmallestQuadrate(List<QuadrangleImpl> quadrangleImplList) {
        Optional<QuadrangleImpl> min = quadrangleImplList.stream()
                .filter(QuadrangleImpl::isQuadrate)
                .min(Comparator.comparing(QuadrangleImpl::getSquare));
        return min.map(QuadrangleImpl::getSquare).orElse(0.0);
    }

    @Override
    public double getSquareSmallestRhombus(List<QuadrangleImpl> quadrangleImplList) {
        Optional<QuadrangleImpl> min = quadrangleImplList.stream()
                .filter(QuadrangleImpl::isRhombus)
                .min(Comparator.comparing(QuadrangleImpl::getSquare));
        return min.map(QuadrangleImpl::getSquare).orElse(0.0);    }

    @Override
    public double getSquareSmallestRectangle(List<QuadrangleImpl> quadrangleImplList) {
        Optional<QuadrangleImpl> min = quadrangleImplList.stream()
                .filter(QuadrangleImpl::isRectangle)
                .min(Comparator.comparing(QuadrangleImpl::getSquare));
        return min.map(QuadrangleImpl::getSquare).orElse(0.0);    }

    @Override
    public double getSquareSmallestRandomQuadrangle(List<QuadrangleImpl> quadrangleImplList) {
        Optional<QuadrangleImpl> min = quadrangleImplList.stream()
                .filter(QuadrangleImpl::isRandomQuadrangle)
                .min(Comparator.comparing(QuadrangleImpl::getSquare));
        return min.map(QuadrangleImpl::getSquare).orElse(0.0);    }

    @Override
    public double getPerimeterBiggestQuadrate(List<QuadrangleImpl> quadrangleImplList) {
        Optional<QuadrangleImpl> max = quadrangleImplList.stream()
                .filter(QuadrangleImpl::isQuadrate)
                .max(Comparator.comparing(QuadrangleImpl::getPerimeter));
        return max.map(QuadrangleImpl::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterBiggestRhombus(List<QuadrangleImpl> quadrangleImplList) {
        Optional<QuadrangleImpl> max = quadrangleImplList.stream()
                .filter(QuadrangleImpl::isRhombus)
                .max(Comparator.comparing(QuadrangleImpl::getPerimeter));
        return max.map(QuadrangleImpl::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterBiggestRectangle(List<QuadrangleImpl> quadrangleImplList) {
        Optional<QuadrangleImpl> max = quadrangleImplList.stream()
                .filter(QuadrangleImpl::isRectangle)
                .max(Comparator.comparing(QuadrangleImpl::getPerimeter));
        return max.map(QuadrangleImpl::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterBiggestRandomQuadrangle(List<QuadrangleImpl> quadrangleImplList) {
        Optional<QuadrangleImpl> max = quadrangleImplList.stream()
                .filter(QuadrangleImpl::isRandomQuadrangle)
                .max(Comparator.comparing(QuadrangleImpl::getPerimeter));
        return max.map(QuadrangleImpl::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterSmallestQuadrate(List<QuadrangleImpl> quadrangleImplList) {
        Optional<QuadrangleImpl> min = quadrangleImplList.stream()
                .filter(QuadrangleImpl::isQuadrate)
                .min(Comparator.comparing(QuadrangleImpl::getPerimeter));
        return min.map(QuadrangleImpl::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterSmallestRhombus(List<QuadrangleImpl> quadrangleImplList) {
        Optional<QuadrangleImpl> min = quadrangleImplList.stream()
                .filter(QuadrangleImpl::isRhombus)
                .min(Comparator.comparing(QuadrangleImpl::getPerimeter));
        return min.map(QuadrangleImpl::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterSmallestRectangle(List<QuadrangleImpl> quadrangleImplList) {
        Optional<QuadrangleImpl> min = quadrangleImplList.stream()
                .filter(QuadrangleImpl::isRectangle)
                .min(Comparator.comparing(QuadrangleImpl::getPerimeter));
        return min.map(QuadrangleImpl::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterSmallestRandomQuadrangle(List<QuadrangleImpl> quadrangleImplList) {
        Optional<QuadrangleImpl> min = quadrangleImplList.stream()
                .filter(QuadrangleImpl::isRandomQuadrangle)
                .min(Comparator.comparing(QuadrangleImpl::getPerimeter));
        return min.map(QuadrangleImpl::getPerimeter).orElse(0.0);
    }

    private double getSegmentLength(Point pointA, Point pointB){
        return Math.sqrt(Math.pow((pointB.getX() - pointA.getX()), 2) + Math.pow((pointB.getY() - pointA.getY()), 2));
    }
}
