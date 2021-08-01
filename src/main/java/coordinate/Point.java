package coordinate;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        checkException(x, y);
        this.x = x;
        this.y = y;
    }

    private void checkException(int x, int y) {
        if(rangeOut(x) || rangeOut(y)){
            throw new IllegalArgumentException();
        }
    }

    private boolean rangeOut(int value) {
        return value > 24 || value < 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
