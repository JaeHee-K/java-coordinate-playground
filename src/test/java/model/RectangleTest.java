package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Figure figure;
    FigureFactory figureFactory;
    List<Point> points;

    @BeforeEach
    void init(){
        figureFactory = new FigureFactory();
        points = Arrays.asList(new Point(10,10), new Point(22,10), new Point(22,18), new Point(10,18));
        figure = figureFactory.figureCreate(points);
    }

    @Test
    void 입력값이_제대로_들어가있는지_확인() {
        assertThat(figure.hasPoint(10,10)).isTrue();
        assertThat(figure.hasPoint(22,10)).isTrue();
        assertThat(figure.hasPoint(22,18)).isTrue();
        assertThat(figure.hasPoint(10,18)).isTrue();
        assertThat(figure.hasPoint(1,24)).isFalse();
    }

    @Test
    void 직사각형이_아닌_경우() {
        points = Arrays.asList(new Point(1,2), new Point(3,4), new Point(5,6), new Point(7,8));
        assertThrows(IllegalArgumentException.class, () -> {
            figure = figureFactory.figureCreate(points);
        });
    }

    @Test
    void 정확한_계산() {
        assertThat(figure.calculateDistance()).isEqualTo(96.0);
    }
}