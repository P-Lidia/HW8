package ru.plidia.hw8.task3.main;

import ru.plidia.hw8.task3.util.Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"cat", "orange", "elephant", "bird"};
        String [] res = Sorting.mergeSort(arr);
        System.out.println(Arrays.toString(res));
    }
}
