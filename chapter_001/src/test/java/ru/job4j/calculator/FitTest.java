package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void man180Weight() {
        double height = 180;
        double expected = 92;
        double out = Fit.manWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void woman170Weight() {
        double height = 170;
        double expected = 69;
        double out = Fit.womanWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }

}
