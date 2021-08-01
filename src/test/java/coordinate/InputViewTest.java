package coordinate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {
    private InputView inputView;
    private FigureGenerator figureGenerator;
    private List<Point> testPoints;

    @BeforeEach
    void init(){
        inputView = new InputView();
        figureGenerator = new FigureGenerator();
        testPoints = new ArrayList<>();
    }

    @Test
    void 정규표현식_확인_직선() {
        List<Point> points = inputView.inputValue("(1,2)-(3,4)");
        Figure figure = figureGenerator.setFigure(points);
        testPoints.add(new Point(1,2));
        testPoints.add(new Point(3,4));
        Figure dumpFigure = figureGenerator.setFigure(testPoints);
        String actual = Integer.toString(figure.getPoints().get(0).getX() + figure.getPoints().get(0).getY() + figure.getPoints().get(1).getX() + figure.getPoints().get(1).getY());
        String expect = Integer.toString(dumpFigure.getPoints().get(0).getX() + dumpFigure.getPoints().get(0).getY() + dumpFigure.getPoints().get(1).getX() + dumpFigure.getPoints().get(1).getY());
        assertThat(actual).isEqualTo(expect);
    }

    @Test
    void 잘못된_정규표현식_입력() {
        assertThrows(IllegalArgumentException.class, () -> {
            inputView.inputValue("*(1,2)-(3,4)");
        });
    }
}