package ru.plidia.hw8.task1.main;

import ru.plidia.hw8.task1.entity.Student;
import ru.plidia.hw8.task1.util.Sorting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Иванов", 4.5);
        Student st2 = new Student("Петров", 3.7);
        Student st3 = new Student("Сидоров", 4.2);
        Student st4 = new Student("Козлов", 5.0);
        Student st5 = new Student("Смирнов", 3.9);
        List<Student> studentList = new ArrayList<>(5);
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        Sorting.bubbleSort(studentList);
        System.out.println(studentList);
    }
}