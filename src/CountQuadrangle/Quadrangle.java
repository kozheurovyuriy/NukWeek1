package CountQuadrangle;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Quadrangle implements Quadrangleable{

    private Point firstPoint, secondPoint, thirdPoint, fouthPoint;

    public Quadrangle(Point firstPoint, Point secondPoint, Point thirdPoint, Point fouthPoint) {
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
    public long countOfQuadrate(List<Quadrangle> quadrangleList){
        return quadrangleList.stream().filter(Quadrangle::isQuadrate).count();
    }

    @Override
    public long countOfRhombus(List<Quadrangle> quadrangleList){
        return quadrangleList.stream().filter(Quadrangle::isRhombus).count();
    }

    @Override
    public long countOfRectangle(List<Quadrangle> quadrangleList){
        return quadrangleList.stream().filter(Quadrangle::isRectangle).count();
    }

    @Override
    public long countOfRandomQuadrangle(List<Quadrangle> quadrangleList){
        return quadrangleList.stream().filter(Quadrangle::isRandomQuadrangle).count();
    }

    @Override
    public double getSquareBiggestQuadrate(List<Quadrangle> quadrangleList) {
        Optional<Quadrangle> max = quadrangleList.stream()
                .filter(Quadrangle::isQuadrate)
                .max(Comparator.comparing(Quadrangle::getSquare));
        return max.map(Quadrangle::getSquare).orElse(0.0);
    }

    @Override
    public double getSquareBiggestRhombus(List<Quadrangle> quadrangleList) {
        Optional<Quadrangle> max = quadrangleList.stream()
                .filter(Quadrangle::isRhombus)
                .max(Comparator.comparing(Quadrangle::getSquare));
        return max.map(Quadrangle::getSquare).orElse(0.0);
    }

    @Override
    public double getSquareBiggestRectangle(List<Quadrangle> quadrangleList) {
        Optional<Quadrangle> max = quadrangleList.stream()
                .filter(Quadrangle::isRectangle)
                .max(Comparator.comparing(Quadrangle::getSquare));
        return max.map(Quadrangle::getSquare).orElse(0.0);
    }

    @Override
    public double getSquareBiggestRandomQuadrangle(List<Quadrangle> quadrangleList) {
        Optional<Quadrangle> max = quadrangleList.stream()
                .filter(Quadrangle::isRandomQuadrangle)
                .max(Comparator.comparing(Quadrangle::getSquare));
        return max.map(Quadrangle::getSquare).orElse(0.0);
    }

    @Override
    public double getSquareSmallestQuadrate(List<Quadrangle> quadrangleList) {
        Optional<Quadrangle> min = quadrangleList.stream()
                .filter(Quadrangle::isQuadrate)
                .min(Comparator.comparing(Quadrangle::getSquare));
        return min.map(Quadrangle::getSquare).orElse(0.0);
    }

    @Override
    public double getSquareSmallestRhombus(List<Quadrangle> quadrangleList) {
        Optional<Quadrangle> min = quadrangleList.stream()
                .filter(Quadrangle::isRhombus)
                .min(Comparator.comparing(Quadrangle::getSquare));
        return min.map(Quadrangle::getSquare).orElse(0.0);    }

    @Override
    public double getSquareSmallestRectangle(List<Quadrangle> quadrangleList) {
        Optional<Quadrangle> min = quadrangleList.stream()
                .filter(Quadrangle::isRectangle)
                .min(Comparator.comparing(Quadrangle::getSquare));
        return min.map(Quadrangle::getSquare).orElse(0.0);    }

    @Override
    public double getSquareSmallestRandomQuadrangle(List<Quadrangle> quadrangleList) {
        Optional<Quadrangle> min = quadrangleList.stream()
                .filter(Quadrangle::isRandomQuadrangle)
                .min(Comparator.comparing(Quadrangle::getSquare));
        return min.map(Quadrangle::getSquare).orElse(0.0);    }

    @Override
    public double getPerimeterBiggestQuadrate(List<Quadrangle> quadrangleList) {
        Optional<Quadrangle> max = quadrangleList.stream()
                .filter(Quadrangle::isQuadrate)
                .max(Comparator.comparing(Quadrangle::getPerimeter));
        return max.map(Quadrangle::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterBiggestRhombus(List<Quadrangle> quadrangleList) {
        Optional<Quadrangle> max = quadrangleList.stream()
                .filter(Quadrangle::isRhombus)
                .max(Comparator.comparing(Quadrangle::getPerimeter));
        return max.map(Quadrangle::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterBiggestRectangle(List<Quadrangle> quadrangleList) {
        Optional<Quadrangle> max = quadrangleList.stream()
                .filter(Quadrangle::isRectangle)
                .max(Comparator.comparing(Quadrangle::getPerimeter));
        return max.map(Quadrangle::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterBiggestRandomQuadrangle(List<Quadrangle> quadrangleList) {
        Optional<Quadrangle> max = quadrangleList.stream()
                .filter(Quadrangle::isRandomQuadrangle)
                .max(Comparator.comparing(Quadrangle::getPerimeter));
        return max.map(Quadrangle::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterSmallestQuadrate(List<Quadrangle> quadrangleList) {
        Optional<Quadrangle> min = quadrangleList.stream()
                .filter(Quadrangle::isQuadrate)
                .min(Comparator.comparing(Quadrangle::getPerimeter));
        return min.map(Quadrangle::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterSmallestRhombus(List<Quadrangle> quadrangleList) {
        Optional<Quadrangle> min = quadrangleList.stream()
                .filter(Quadrangle::isRhombus)
                .min(Comparator.comparing(Quadrangle::getPerimeter));
        return min.map(Quadrangle::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterSmallestRectangle(List<Quadrangle> quadrangleList) {
        Optional<Quadrangle> min = quadrangleList.stream()
                .filter(Quadrangle::isRectangle)
                .min(Comparator.comparing(Quadrangle::getPerimeter));
        return min.map(Quadrangle::getPerimeter).orElse(0.0);
    }

    @Override
    public double getPerimeterSmallestRandomQuadrangle(List<Quadrangle> quadrangleList) {
        Optional<Quadrangle> min = quadrangleList.stream()
                .filter(Quadrangle::isRandomQuadrangle)
                .min(Comparator.comparing(Quadrangle::getPerimeter));
        return min.map(Quadrangle::getPerimeter).orElse(0.0);
    }

    private double getSegmentLength(Point pointA, Point pointB){
        return Math.sqrt(Math.pow((pointB.getX() - pointA.getX()), 2) + Math.pow((pointB.getY() - pointA.getY()), 2));
    }
}
