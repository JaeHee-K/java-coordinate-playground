package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory {
    private static Map<Integer, Function<List<Point>, Figure>> classifier = new HashMap<>();

    static{
        classifier.put(2, Line::new); //new 메소드 참조, apply로 인수 적용
        classifier.put(3, Triangle::new);
        classifier.put(4, Rectangle::new);
    }

    public Figure figureCreate(List<Point> points){
        checkPointSize(points.size());
        return classifier.get(points.size()).apply(points);
    }

    private void checkPointSize(int size) {
        if(size > 4 || size < 2){
            throw new IllegalArgumentException("좌표 개수가 유효하지 않습니다.");
        }
    }
}