package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] list = new String[10];
        int[] num = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<list.length; i++){
            list[i] = reader.readLine();
            num[i] = list[i].length();
            //System.out.println(num[i]);
        }
        for (int i=0; i<num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
