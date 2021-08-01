package coordinate;

import java.util.List;

public class CoordinateController {

    private static void start(){
        List<Point> points = new InputView().inputValue();
        Figure figure = new FigureGenerator().setFigure(points);
        new OutputView().calculateResult(figure);
    }

    public static void main(String[] args) {
        start();
    }
}
