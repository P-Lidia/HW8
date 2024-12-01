package ru.plidia.hw8.task2.util;

public class Sorting {
    public static void quickSort(String[] arr, int low, int high) {
        if (arr.length == 0 || low >= high) return;
        int middle = low + (high - low) / 2;
        String border = arr[middle];
        int i = low, j = high;
        while (i <= j) {
            String str = arr[i];
            while (str.charAt(0) < border.charAt(0)) {
                i++;
                str = arr[i];
            }
            str = arr[j];
            while (str.charAt(0) > border.charAt(0)) {
                j--;
                str = arr[j];
            }
            if (i <= j) {
                str = arr[i];
                arr[i] = arr[j];
                arr[j] = str;
                i++;
                j--;
            }
        }
        if (low < j) quickSort(arr, low, j);
        if (high > i) quickSort(arr, i, high);
    }
}
