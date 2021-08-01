package coordinate;

import java.util.List;

public class Triangle extends FigureHub{
    private Point firstPoint, secondPoint, thirdPoint;

    public Triangle(List<Point> points) {
        super(points);
        firstPoint = points.get(0);
        secondPoint = points.get(1);
        thirdPoint = points.get(2);
    }

    private double setSide(Point prePoint, Point nextPoint) {
        double side = Math.sqrt(Math.pow(prePoint.getX() - nextPoint.getX(), 2) + Math.pow(prePoint.getY() - nextPoint.getY(), 2));
        return side;
    }

    private double calculateHeron(double firstSide, double secondSide, double thirdSide) {
        double s = (firstSide + secondSide + thirdSide) / 2;
        double result = Math.sqrt(s*(s-firstSide)*(s-secondSide)*(s-thirdSide));
        return Math.round((result*10)/10.0);
    }

    @Override
    public double calculateDistance() {
        double firstSide = setSide(firstPoint, secondPoint);
        double secondSide = setSide(secondPoint, thirdPoint);
        double thirdSide = setSide(thirdPoint, firstPoint);

        return calculateHeron(firstSide, secondSide, thirdSide);
    }

    @Override
    public String getDistance() {
        String result = "삼각형 넓이는 : " + calculateDistance();
        return result;
    }
}
