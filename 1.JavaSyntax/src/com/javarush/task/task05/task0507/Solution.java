package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int count = 0;
        for (; true; )
        {
            int num = Integer.parseInt((reader.readLine()));
            if (num == -1)
                break;
            sum += num;
            count++;
        }

        System.out.println((sum*1.0)/count);
    }
}
