package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> first = new ArrayList();
        ArrayList<Integer> second = new ArrayList();
        ArrayList<Integer> third = new ArrayList();
        ArrayList<Integer> fourth = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<20; i++) {
            String s = reader.readLine();
            first.add(Integer.parseInt(s));
        }
        for (int i=0; i<first.size(); i++){
            if (first.get(i) % 2 == 0 && first.get(i) % 3 == 0){
                second.add(first.get(i));
                third.add(first.get(i));
            } else if (first.get(i) % 3 == 0) {
                second.add(first.get(i));
            } else if (first.get(i) % 2 == 0) {
                third.add(first.get(i));
            } else fourth.add(first.get(i));
        }

        printList(first);
        printList(second);
        printList(third);
        printList(fourth);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
