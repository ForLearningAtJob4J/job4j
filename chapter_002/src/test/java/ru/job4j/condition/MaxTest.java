package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max2() {
        Max check = new Max();
        int result = check.max(1, 4);
        assertThat(result, is(4));
    }

    @Test
    public void max3() {
        Max check = new Max();
        int result = check.max(1, 4, 10);
        assertThat(result, is(10));
    }

    @Test
    public void max4() {
        Max check = new Max();
        int result = check.max(1, 4, 2, 1);
        assertThat(result, is(4));
    }
}