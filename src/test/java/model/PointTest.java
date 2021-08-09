package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    Point point;

    @BeforeEach
    void init(){
        point = new Point(1,2);
    }

    @Test
    void 좌표값_길이_제한() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Point(25,1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Point(0,24);
        });
    }

    @Test
    void 값이_제대로_들어갔는지_증명() {
        assertTrue(point.isSame(1,2));
    }
}