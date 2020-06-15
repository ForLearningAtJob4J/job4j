package ru.job4j.stream;

public class Student {
    int score;
    String surname;

    public Student(int score, String surname) {
        this.score = score;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
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

        return surname.equals(student.surname);
    }

    @Override
    public int hashCode() {
        return surname.hashCode();
    }
}
