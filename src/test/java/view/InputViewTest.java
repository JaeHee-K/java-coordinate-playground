package view;

import model.Figure;
import model.FigureFactory;
import model.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class InputViewTest {
    InputView inputView;
    FigureFactory figureFactory;
    private List<Point> points;
    Figure figure;

    @BeforeEach
    void init(){
        inputView = new InputView();
        figureFactory = new FigureFactory();
        points = new ArrayList<>();
    }

    @Test
    void Line_입력테스트() {
        figure = inputView.inputCoordinate("(1,2)-(3,4)");
        points.add(new Point(1,2));
        points.add(new Point(3,4));
        Figure figureSub = figureFactory.figureCreate(points);
        for(int i=0;i<figure.getPoint().size();i++){
            assertThat(figure.getPoint().get(i).getX()).isEqualTo(figureSub.getPoint().get(i).getX());
            assertThat(figure.getPoint().get(i).getY()).isEqualTo(figureSub.getPoint().get(i).getY());
        }
    }

    @Test
    void Triangle_입력테스트() {
        figure = inputView.inputCoordinate("(1,2)-(3,4)-(5,6)");
        points.add(new Point(1,2));
        points.add(new Point(3,4));
        points.add(new Point(5,6));
        Figure figureSub = figureFactory.figureCreate(points);
        for(int i=0;i<figure.getPoint().size();i++){
            assertThat(figure.getPoint().get(i).getX()).isEqualTo(figureSub.getPoint().get(i).getX());
            assertThat(figure.getPoint().get(i).getY()).isEqualTo(figureSub.getPoint().get(i).getY());
        }
    }

    @Test
    void Rectangle_입력테스트() {
        figure = inputView.inputCoordinate("(10,10)-(22,10)-(22,18)-(10,18)");
        points.add(new Point(10,10));
        points.add(new Point(22,10));
        points.add(new Point(22,18));
        points.add(new Point(10,18));
        Figure figureSub = figureFactory.figureCreate(points);
        for(int i=0;i<figure.getPoint().size();i++){
            assertThat(figure.getPoint().get(i).getX()).isEqualTo(figureSub.getPoint().get(i).getX());
            assertThat(figure.getPoint().get(i).getY()).isEqualTo(figureSub.getPoint().get(i).getY());
        }
    }
}