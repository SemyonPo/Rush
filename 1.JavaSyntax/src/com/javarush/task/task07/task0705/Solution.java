package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] big = new int[20];
        int[] small1 = new int[10];
        int[] small2 = new int[10];

        for (int i = 0; i < big.length ; i++) {
            big[i] = Integer.parseInt(reader.readLine());

            if (i <= 9){
                small1[i] = big[i];
            }else if (i > 9){
                small2[i - 10] = big[i];
            }
        }
        for (int i = 0; i < small2.length; i++) {
            System.out.println(small2[i]);
        }
    }
}
