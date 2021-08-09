package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import view.InputView;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FigureFactoryTest {
    private List<Point> points;
    Figure figure;
    FigureFactory figureFactory;

    @BeforeEach
    void init(){
        points = new ArrayList<>();
        figureFactory = new FigureFactory();
    }

    @Test
    void 입력값_개수_1개() {
        points.add(new Point(1, 2));
        assertThrows(IllegalArgumentException.class, () -> {
            figureFactory.figureCreate(points);
        });
    }

    @Test
    void 입력값_개수_5개이상() {
        points.add(new Point(1, 2));
        points.add(new Point(3, 4));
        points.add(new Point(5, 6));
        points.add(new Point(7, 8));
        points.add(new Point(9, 10));
        assertThrows(IllegalArgumentException.class, () -> {
            figureFactory.figureCreate(points);
        });
    }
}