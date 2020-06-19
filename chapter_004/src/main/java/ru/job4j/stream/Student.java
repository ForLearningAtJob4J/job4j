package ru.job4j.stream;

import java.util.Objects;

public class Student {
    int score;
    String surname;

    public Student(String surname, int score) {
        this.score = score;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    public boolean inA() {
        return score >= 70 && score <= 100;
    }

    public boolean inB() {
        return score >= 50 && score < 70;
    }

    public boolean inC() {
        return score > 0 && score < 50;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;

        return score == student.score
                && surname.equals(student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, surname);
    }
}
