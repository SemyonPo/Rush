package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        String min = list.get(0);
        int minIndex = 0;
        String max = list.get(0);
        int maxIndex = 0;


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min.length()) {
                min = list.get(i);
                minIndex = i;
            }else if (list.get(i).length() > max.length()){
                max = list.get(i);
                maxIndex = i;
            }
        }

        /*
        if (minIndex < maxIndex){
            System.out.println(min);
        } else System.out.println(max);
        */

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min.length()){
                System.out.println(list.get(i));
                break;
            }
            if (list.get(i).length() == max.length()){
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
