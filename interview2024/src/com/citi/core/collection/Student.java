package com.citi.core.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student(101,"abc"),
                new Student(105,"def"),
                new Student(103,"ghi"),
                new Student(104,"jkl"),
                new Student(101,"aba")
        );

        System.out.println("before sort => " + studentList);
        //Collections.sort(studentList);
        Collections.sort(studentList, new NameComparator());
        System.out.println("after sort => " + studentList);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Student o) {
        if (id == o.id)
            return 0;
        else if (id > o.id)
            return 1;
        else
            return -1;
    }
}
