package ru.plidia.hw8.task4.util;

public class Sorting {
    public static void insertionSort(String[] arr) {
        int[] arrCount = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            int counter = 0;
            for (int n = 0; n < str.length(); n++) {
                switch (str.charAt(n)) {
                    case 'a', 'e', 'i', 'o', 'u', 'y':
                        counter++;
                        break;
                }
            }
            arrCount[i] = counter;
            int swap = arrCount[i];
            int j = i;
            while (j > 0 && swap < arrCount[j - 1]) {
                arrCount[j] = arrCount[j - 1];
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = str;
            arrCount[j] = swap;
        }
    }
}








