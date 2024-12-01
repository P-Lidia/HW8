package ru.plidia.hw8.task3.util;

import java.util.Arrays;

public class Sorting {
    public static String[] mergeSort(String[] arr) {
        String[] buffer1 = Arrays.copyOf(arr, arr.length);
        String[] buffer2 = new String[arr.length];
        return mergeSortInner(buffer1, buffer2, 0, arr.length);
    }

    public static String[] mergeSortInner(String[] buffer1, String[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }
        int middle = startIndex + (endIndex - startIndex) / 2;
        String[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        String[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        String[] result = ((sorted1 == buffer1) ? buffer2 : buffer1);
        while (index1 < middle && index2 < endIndex) {
            String str1 = sorted1[index1];
            String str2 = sorted2[index2];
            if (str1.length() < str2.length()) {
                result[destIndex] = sorted1[index1];
                destIndex++;
                index1++;
            } else {
                result[destIndex] = sorted2[index2];
                destIndex++;
                index2++;
            }
        }
        while (index1 < middle) {
            result[destIndex] = sorted1[index1];
            destIndex++;
            index1++;
        }
        while (index2 < endIndex) {
            result[destIndex] = sorted2[index2];
            destIndex++;
            index2++;
        }
        return result;
    }
}