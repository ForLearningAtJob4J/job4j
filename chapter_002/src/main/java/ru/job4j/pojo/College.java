package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Машка Ромашкина");
        student.setGroup("М11");
        student.setAdmission(new Date());

        System.out.println(student.getName() + " учится в группе " + student.getGroup() + " с " + student.getAdmission());
    }
}
