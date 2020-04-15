package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void areaOfTwoSidesOnAxes() {
        Triangle t = new Triangle(new Point(0, 1), new Point(1, 0), new Point(0, 0));
        Assert.assertEquals(0.5, t.area(), 0.01);
    }

    @Test
    public void areaOfOneSideOnAxes() {
        Triangle t = new Triangle(new Point(0, 10), new Point(10, 10), new Point(0, 0));
        Assert.assertEquals(50, t.area(), 0.01);
    }
}
