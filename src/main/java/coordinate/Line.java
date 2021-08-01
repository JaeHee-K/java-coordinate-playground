package coordinate;

import java.util.List;

public class Line extends FigureHub {
    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public double calculateDistance() {
        double distance = Math.sqrt(Math.pow(getPoints().get(0).getX() - getPoints().get(1).getX(), 2) + Math.pow(getPoints().get(0).getY() - getPoints().get(1).getY(), 2));
        return distance;
    }

    @Override
    public String getDistance() {
        String result = "두 점 사이 거리는 : " + calculateDistance();
        return result;
    }
}
