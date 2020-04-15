package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(100, 0);
        Assert.assertEquals(100, a.distance(b), 0.01);
    }

    @Test
    public void distance3d() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(100, 0, 0);
        Assert.assertEquals(100, a.distance(b), 0.01);
    }
}