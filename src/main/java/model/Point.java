package model;

public class Point {
    private int x, y;

    public Point(int x, int y){
        checkLength(x, y);
        this.x = x;
        this.y = y;
    }

    private void checkLength(int x, int y) {
        if(checkRange(x) || checkRange(y)){
            throw new IllegalArgumentException();
        }
    }

    private boolean checkRange(int value){
        return value > 24 || value < 1;
    }

    public double lineCalculation(Point point){
        double line = Math.sqrt(squareCalculation(this.getX(),point.getX()) + squareCalculation(this.getY(), point.getY()));
        return line;
    }

    private double squareCalculation(int x, int y) {
        return Math.pow(x - y, 2);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public boolean isSame(int x, int y){
        return this.x == x && this.y == y;
    }
}
