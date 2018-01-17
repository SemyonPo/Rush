package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код\
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int nNum = Integer.parseInt(sNum);
        String sNum1 = reader.readLine();
        int nNum1 = Integer.parseInt(sNum1);

        if (nNum <= nNum1){
            System.out.println(nNum);
        }else System.out.println(nNum1);
    }
}