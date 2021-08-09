package model;

import java.util.List;

public class Line extends FigureHub{
    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public double calculateDistance() {
        double distance = getPoint().get(0).lineCalculation(getPoint().get(1));
        return distance;
    }

    @Override
    public String getDistance() {
        return "두 점 사이의 거리는 " + calculateDistance();
    }
}
