package coordinate;

import java.util.List;

public class FigureGenerator {

    public Figure setFigure(List<Point> points){
        return setClassifyShape(points);
    }

    private Figure setClassifyShape(List<Point> points){
        if(points.size() == 2){
            return new Line(points);
        }
        if(points.size() == 4){
            return new Rectangle(points);
        }
        if(points.size() == 3){
            return new Triangle(points);
        }
        throw new IllegalArgumentException();
    }
}
