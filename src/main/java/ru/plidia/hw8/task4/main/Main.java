package ru.plidia.hw8.task4.main;

import ru.plidia.hw8.task4.util.Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"cat", "orange", "elephant", "bird"};
        Sorting.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}