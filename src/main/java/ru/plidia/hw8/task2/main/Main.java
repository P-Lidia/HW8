package ru.plidia.hw8.task2.main;

import ru.plidia.hw8.task2.util.Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"apple", "orange", "grape", "banana"};
        Sorting.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}