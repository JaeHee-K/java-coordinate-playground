package coordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {
    private Scanner scan;
    
    InputView(){
        scan = new Scanner(System.in);
    }
    
    public List<Point> inputValue(){
        System.out.println("좌표를 입력하세요.");
        String value = scan.nextLine();
        return inputValue(value);
    }

    public List<Point> inputValue(String value) {
        try {
            checkValueExpress(value);
            List<Point> points = valueToPoint(value);
            return points;
        } catch (IllegalArgumentException e){
            System.out.println("잘못된 입력입니다.");
            return inputValue();
        }
    }

    private void checkValueExpress(String value){
        Pattern pattern = Pattern.compile("(\\([0-9]{1,2},[0-9]{1,2}\\))(-(\\([0-9]{1,2},[0-9]{1,2}\\))){0,3}");
//        Pattern pattern = Pattern.compile("(([0-9]{1,2},[0-9]{1,2}))((-)(([0-9]{1,2},[0-9]{1,2}))){0,3}");
        Matcher matcher = pattern.matcher(value);
        if(!matcher.matches()){
            throw new IllegalArgumentException();
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
//        Pattern pattern = Pattern.compile("(([0-9]{1,2}),([0-9]{1,2}))");
        Matcher matcher = pattern.matcher(value);
        if(matcher.find()){
            int x = Integer.parseInt(matcher.group(1));
            int y = Integer.parseInt(matcher.group(2));
            Point point = new Point(x, y);
            return point;
        }
        throw new IllegalArgumentException();
    }
}
