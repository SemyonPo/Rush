package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List arr = new ArrayList<Integer>();

        int a = 0;
        for (; true; )
        {
            int num = Integer.parseInt((reader.readLine()));
            if (num == -1)
                break;
            arr.add(num);
        }

        for (int i = 0; i < arr.size(); i++) {
            a += (Integer) arr.get(i);
        }
        System.out.println(a - 1);
    }
}
