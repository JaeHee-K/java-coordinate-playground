package coordinate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LineTest {
    List<Point> points;
    @BeforeEach
    void init(){
        points = Arrays.asList(new Point(10,10), new Point(14,15));
    }
    @Test
    void 정확한_계산() {
        Figure figure = new Line(points);
        assertThat(figure.calculateDistance()).isEqualTo(6.4031242374328485);
    }
}