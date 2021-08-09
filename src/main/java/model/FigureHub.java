package model;

import java.util.List;

public abstract class FigureHub implements Figure{
    private List<Point> points;

    public FigureHub(List<Point> points){
        this.points = points;
    }

    @Override
    public List<Point> getPoint() {
        return points;
    }

    @Override
    public boolean hasPoint(int x, int y) {
        return getPoint().stream().anyMatch(point -> point.isSame(x, y));
    }
}
