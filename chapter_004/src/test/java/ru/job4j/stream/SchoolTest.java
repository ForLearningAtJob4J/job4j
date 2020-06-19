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
        add(new Student("Петров", 10));
        add(new Student("Иванов", 20));
        add(new Student("Синицын", 30));
        add(new Student("Воробьев", 40));
        add(new Student("Воронов", 50));
        add(new Student("Ястребов", 60));
        add(new Student("Коршунов", 70));
        add(new Student("Волков", 80));
        add(new Student("Медведев", 90));
        add(new Student("Зайцев", 100));
    } };

    @Test
    public void whenA() {
        School school = new School();
        List<Student> result = school.collect(students, Student::inA);
        List<Student> expected = new ArrayList<>() { {
            add(new Student("Коршунов", 70));
            add(new Student("Волков", 80));
            add(new Student("Медведев", 90));
            add(new Student("Зайцев", 100));
        } };
        assertThat(result, is(expected));
    }

    @Test
    public void whenB() {
        School school = new School();
        List<Student> result = school.collect(students, Student::inB);
        List<Student> expected = new ArrayList<>() { {
            add(new Student("Воронов", 50));
            add(new Student("Ястребов", 60));
        } };
        assertThat(result, is(expected));
    }

    @Test
    public void whenC() {
        School school = new School();
        List<Student> result = school.collect(students, Student::inC);
        List<Student> expected = new ArrayList<>() { {
            add(new Student("Петров", 10));
            add(new Student("Иванов", 20));
            add(new Student("Синицын", 30));
            add(new Student("Воробьев", 40));
        } };
        assertThat(result, is(expected));
    }

    @Test
    public void whenBAndToMap() {
        School school = new School();
        Map<String, Student> result = school.collectToMap(students);
        Map<String, Student> expected = new HashMap<>() { {
            put("Петров", new Student("Петров", 10));
            put("Иванов", new Student("Иванов", 20));
            put("Синицын", new Student("Синицын", 30));
            put("Воробьев", new Student("Воробьев", 40));
            put("Воронов", new Student("Воронов", 50));
            put("Ястребов", new Student("Ястребов", 60));
            put("Коршунов", new Student("Коршунов", 70));
            put("Волков", new Student("Волков", 80));
            put("Медведев", new Student("Медведев", 90));
            put("Зайцев", new Student("Зайцев", 100));
        } };
        assertThat(result, is(expected));
    }

}