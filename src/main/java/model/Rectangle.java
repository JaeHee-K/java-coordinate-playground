package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Rectangle extends FigureHub{
    private int width;
    private int height;

    public Rectangle(List<Point> points) {
        super(points);
        width = extractWidth(points);
        height = extractHeight(points);
    }

    private int extractWidth(List<Point> points) {
        List<Integer> width = new ArrayList<>();
        for(int i=0;i<points.size();i++){
            width.add(points.get(i).getX());
        }
        width = deleteOverlap(width);
        Collections.sort(width, Collections.reverseOrder());
        return width.get(0)-width.get(1);
    }

    private int extractHeight(List<Point> points) {
        List<Integer> height = new ArrayList<>();
        for(int i=0;i<points.size();i++){
            height.add(points.get(i).getY());
        }
        height = deleteOverlap(height);
        Collections.sort(height, Collections.reverseOrder());
        return height.get(0)-height.get(1);
    }

    private List<Integer> deleteOverlap(List<Integer> array) {
        HashSet<Integer> hashSet = new HashSet<>(array);
        List<Integer> resultArray = new ArrayList<>(hashSet);
        checkLength(resultArray);
        return resultArray;
    }

    private void checkLength(List<Integer> array) {
        if(array.size() != 2){
            throw new IllegalArgumentException("직사각형이 아닙니다.");
        }
    }

    @Override
    public double calculateDistance() {
        return width * height;
    }

    @Override
    public String getDistance() {
        return "사각형 넓이는 " + calculateDistance();
    }
}
