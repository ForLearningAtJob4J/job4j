package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void convertIntegerMatrixToIntegerList() {
        Integer[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7},
                {8, 9, 10}};
        assertThat(Converter.convertIntegerMatrixToIntegerList(matrix),
                is(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
    }
}