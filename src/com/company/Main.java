package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(6);
        System.out.println("Вариант 20\n"+list);
        ListExercise1 ex1 = new ListExercise1(list);
        System.out.println( ex1.deleteDouble());

        ListExerscise2 ex2 = new ListExerscise2(100);
        ex2.findRez();

    }
}
