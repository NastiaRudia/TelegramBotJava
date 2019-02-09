package com.company;

import java.util.ArrayList;

public class ListExercise1 {
    ArrayList<Integer> list;
    ListExercise1(ArrayList<Integer> list_){
        list=list_;
    }
    public  int repeat (int x) {
        int count = 0;
        for (Integer el : list) {
            if (el == x) count++;
        }
        return count;
    }
    public  ArrayList<Integer> deleteDouble(){
        ArrayList<Integer> temp =new ArrayList<>();
        for (Integer el:list)
            if (repeat(el)==2) temp.add(el);
        list.removeAll(temp);
        return list;
    }

}
