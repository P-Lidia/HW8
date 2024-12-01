package ru.plidia.hw8.task5.util;

import java.util.List;

public class Sorting {
    public static void selectionSort(List<String> list) {
        int size = list.size();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            String formula = list.get(i);
            int counter = 0;
            for (int n = 0; n < formula.length(); n++) {
                switch (formula.charAt(n)) {
                    case '+', '-', '*', '/', '(':
                        counter++;
                        break;
                }
            }
            arr[i] = counter;
        }
        for (int i = 0; i < size; i++) {
            int pos = i;
            int min = arr[i];
            String minformula = list.get(i);
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    pos = j;
                    min = arr[j];
                    minformula = list.set(j,list.get(j));
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;
            list.set(pos, list.get(i));
            list.set(i, minformula);
        }
    }
}