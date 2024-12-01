package ru.plidia.hw8.task1.util;

import ru.plidia.hw8.task1.entity.Student;

import java.util.List;

public class Sorting {
    public static void bubbleSort(List<Student> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (list.get(j + 1).getGrade() > list.get(j).getGrade()) {
                    Student st = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, st);
                }
            }
        }

    }
}

// if(arr[j + 1] < arr[j]) {