package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] num = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<num.length; i++){
            String s = reader.readLine();
            num[i] = Integer.parseInt(s);
        }
        for (int i=9; i>=0; i--){
            //num[i] = i-1;
            System.out.println(num[i]);
        }
    }
}

