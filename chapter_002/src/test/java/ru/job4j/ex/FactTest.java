package ru.job4j.ex;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class FactTest {

    @Test
    public void whenCalc()  {
        Fact fact = new Fact();
        assertThat(fact.calc(5), is(120));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenBadArgCalc()  {
        Fact fact = new Fact();
        fact.calc(-5);
    }
}