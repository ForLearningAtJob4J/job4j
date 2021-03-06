package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenRightIsBigger() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenLeftIsBigger() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }
    @Test
    public void whenLeftAndReightAreEqual() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }
}