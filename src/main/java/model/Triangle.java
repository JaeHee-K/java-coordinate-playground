package model;

import java.util.List;

public class Triangle extends FigureHub{
    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public double calculateDistance() {
        double firstSide = setSide(getPoint().get(0), getPoint().get(1));
        double secondSide = setSide(getPoint().get(1), getPoint().get(2));
        double thirdSide = setSide(getPoint().get(2), getPoint().get(0));
        return calculateHeron(firstSide, secondSide, thirdSide);
    }

    private double setSide(Point prePoint, Point nextPoint) {
        return prePoint.lineCalculation(nextPoint);
    }

    private double calculateHeron(double firstSide, double secondSide, double thirdSide) {
        double s = (firstSide + secondSide + thirdSide) / 2;
        double result = Math.sqrt(s*(s-firstSide)*(s-secondSide)*(s-thirdSide));
        return Math.round((result*10)/10.0);
    }

    @Override
    public String getDistance() {
        return "삼각형 넓이는 " + calculateDistance();
    }
}
