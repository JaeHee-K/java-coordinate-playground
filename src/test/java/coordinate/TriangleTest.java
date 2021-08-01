package coordinate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    List<Point> points;

    @BeforeEach
    void init(){
        points = Arrays.asList(new Point(10,10), new Point(14,15), new Point(20,8));
    }

    @Test
    void 정확한_계산() {
        Figure figure = new FigureGenerator().setFigure(points);
        assertThat(figure.calculateDistance()).isEqualTo(29.0);
    }

}