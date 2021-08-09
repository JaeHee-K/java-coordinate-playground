package model;

import java.util.List;

public interface Figure {
    List<Point> getPoint();
    double calculateDistance();
    String getDistance();
    boolean hasPoint(int x, int y);
}
