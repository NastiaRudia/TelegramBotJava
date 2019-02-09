package com.company;

import java.util.ArrayList;

public class ListExerscise2 {
    ArrayList<Integer> list = new ArrayList<>();
    int[] arr3;
    ListExerscise2(int n){
        for (int i=0; i<n; i++){
            list.add(i);
        }
        System.out.println("Вариант 48\n"+list);
    }

    public void findRez(){

        ArrayList<Integer> rez =new ArrayList<>();
        for (int i=1; i<list.size(); i*=3){
            rez.add(list.get(i));
        }
        System.out.println(rez);
    }
}
