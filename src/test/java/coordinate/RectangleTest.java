package coordinate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    List<Point> points;

    @BeforeEach
    void init(){
        points = Arrays.asList(new Point(10,10), new Point(22,10), new Point(22,18), new Point(10,18));
    }

    @Test
    void 정확한_계산() {
        Figure figure = new FigureGenerator().setFigure(points);
        assertThat(figure.calculateDistance()).isEqualTo(96.0);
    }

    @Test
    void 직사각형이_아닌_경우() {
        points = Arrays.asList(new Point(1,2), new Point(3,4), new Point(5,6), new Point(7,8));
        assertThrows(IllegalArgumentException.class, () -> {
            new FigureGenerator().setFigure(points);
        });

    }
}