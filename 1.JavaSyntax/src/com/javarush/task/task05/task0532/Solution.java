package com.javarush.task.task05.task0532;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());

        if (maximum > 0) {
            //напишите тут ваш код
            int[] arr = new int[maximum];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
               if (arr[i] > max) {
                    max = arr[i];
                }
            }
            maximum = max;
            //Arrays.sort(arr);
            //maximum = arr[a-1];
        }
        System.out.println(maximum);
    }
}
