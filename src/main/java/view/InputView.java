package view;

import model.Figure;
import model.FigureFactory;
import model.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {
    private Scanner scan;

    public InputView(){
        scan = new Scanner(System.in);
    }

    public Figure inputCoordinate(){
        System.out.println("좌표를 입력하세요.");
        String value = scan.nextLine();
        return inputCoordinate(value);
    }

    public Figure inputCoordinate(String value) {
        try {
            checkExpress(value);
            List<Point> points = valueToPoint(value);
            return new FigureFactory().figureCreate(points);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return inputCoordinate();
        }
    }

    private void checkExpress(String value) {
        Pattern pattern = Pattern.compile("(\\([0-9]{1,2},[0-9]{1,2}\\))(-(\\([0-9]{1,2},[0-9]{1,2}\\))){0,3}");
        Matcher matcher = pattern.matcher(value);
        if(!matcher.matches()){
            throw new IllegalArgumentException("올바르지 않은 입력값");
        }
    }

    private List<Point> valueToPoint(String value) {
        String[] values = value.split("-");
        List<Point> points = new ArrayList<>();
        for(int i=0;i<values.length;i++){
            points.add(modifyPoint(values[i]));
        }
        return points;
    }

    private Point modifyPoint(String value) {
        Pattern pattern = Pattern.compile("\\(([0-9]{1,2}),([0-9]{1,2})\\)");
        Matcher matcher = pattern.matcher(value);
        if(matcher.find()){
            int x = Integer.parseInt(matcher.group(1));
            int y = Integer.parseInt(matcher.group(2));
            Point point = new Point(x, y);
            return point;
        }
        throw new IllegalArgumentException("올바르지 않은 입력값");
    }
}
