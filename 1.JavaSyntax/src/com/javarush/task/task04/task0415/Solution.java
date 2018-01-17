package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum1 = reader.readLine();
        int nNum1 = Integer.parseInt(sNum1);
        String sNum2 = reader.readLine();
        int nNum2 = Integer.parseInt(sNum2);
        String sNum3 = reader.readLine();
        int nNum3 = Integer.parseInt(sNum3);

        if ((nNum1 + nNum2 > nNum3) && (nNum2+nNum3 > nNum1) && (nNum1+nNum3 > nNum2)){
            System.out.println("Треугольник существует.");
        }else System.out.println("Треугольник не существует.");
    }

}
