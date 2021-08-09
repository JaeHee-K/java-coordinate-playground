package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LineTest {
    Figure figure;
    FigureFactory figureFactory;
    List<Point> points;

    @BeforeEach
    void init(){
        figureFactory = new FigureFactory();
        points = Arrays.asList(new Point(10,10), new Point(14,15));
        figure = figureFactory.figureCreate(points);
    }

    @Test
    void 입력값이_제대로_들어가있는지_확인() {
        assertThat(figure.hasPoint(10,10)).isTrue();
        assertThat(figure.hasPoint(14,15)).isTrue();
        assertThat(figure.hasPoint(1,24)).isFalse();
    }

    @Test
    void 정확한_계산() {
        assertThat(figure.calculateDistance()).isEqualTo(6.4031242374328485);
    }
}