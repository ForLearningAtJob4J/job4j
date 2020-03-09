package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class PointTest {
    @Test
    public void axeYPositive() {
        int x1 = 0,
            y1 = 0,
            x2 = 0,
            y2 = 1;
        double expected = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void axeYNegative() {
        int x1 = 0,
                y1 = 0,
                x2 = 0,
                y2 = -5;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void axeXNegative() {
        int x1 = 0,
                y1 = 0,
                x2 = -7,
                y2 = 0;
        double expected = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
