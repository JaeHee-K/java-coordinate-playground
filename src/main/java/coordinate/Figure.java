package coordinate;

import java.util.List;

public interface Figure {
    List<Point> getPoints();
    double calculateDistance();
    String getDistance();
}
