package ru.plidia.hw8.task5.main;

import ru.plidia.hw8.task5.util.Sorting;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> formulaList = new ArrayList<>();
        String formula1 = "5+6+32=43";
        String formula2 = "1+1=2";
        String formula3 = "(3+5)*4*21=483";
        String formula4 = "((21-20)*(32-30))/2=1";
        formulaList.add(formula1);
        formulaList.add(formula2);
        formulaList.add(formula3);
        formulaList.add(formula4);
        Sorting.selectionSort(formulaList);
        System.out.println(formulaList);
    }
}
