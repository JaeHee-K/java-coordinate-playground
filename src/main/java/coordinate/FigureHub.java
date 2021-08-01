package coordinate;

import java.util.List;

public abstract class FigureHub implements Figure{
    private List<Point> points;

    public FigureHub(List<Point> points){
        this.points = points;
    }

    @Override
    public List<Point> getPoints() {
        return points;
    }
}
