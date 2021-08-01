package coordinate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void 좌표값_길이_제한() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Point(25,1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Point(0,24);
        });
    }
}