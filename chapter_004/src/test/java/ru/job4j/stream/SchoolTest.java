package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SchoolTest {
    List<Student> students = new ArrayList<>() { {
        add(new Student(10, "Петров"));
        add(new Student(20, "Иванов"));
        add(new Student(30, "Синицын"));
        add(new Student(40, "Воробьев"));
        add(new Student(50, "Воронов"));
        add(new Student(60, "Ястребов"));
        add(new Student(70, "Коршунов"));
        add(new Student(80, "Волков"));
        add(new Student(90, "Медведев"));
        add(new Student(100, "Зайцев"));
    } };

    @Test
    public void whenA() {
        School school = new School();
        List<Student> result = school.collect(students, Student::inA);
        List<Student> expected = new ArrayList<>() { {
            add(new Student(70, "Коршунов"));
            add(new Student(80, "Волков"));
            add(new Student(90, "Медведев"));
            add(new Student(100, "Зайцев"));
        } };
        assertThat(result, is(expected));
    }

    @Test
    public void whenB() {
        School school = new School();
        List<Student> result = school.collect(students, Student::inB);
        List<Student> expected = new ArrayList<>() { {
            add(new Student(50, "Воронов"));
            add(new Student(60, "Ястребов"));
        } };
        assertThat(result, is(expected));
    }

    @Test
    public void whenC() {
        School school = new School();
        List<Student> result = school.collect(students, Student::inC);
        List<Student> expected = new ArrayList<>() { {
            add(new Student(10, "Петров"));
            add(new Student(20, "Иванов"));
            add(new Student(30, "Синицын"));
            add(new Student(40, "Воробьев"));
        } };
        assertThat(result, is(expected));
    }

    @Test
    public void whenBAndToMap() {
        School school = new School();
        Map<String, Student> result = school.collectToMap(students, Student::inB);
        Map<String, Student> expected = new HashMap<>() { {
            put("Воронов", new Student(50, "Воронов"));
            put("Ястребов", new Student(60, "Ястребов"));
        } };
        assertThat(result, is(expected));
    }

}