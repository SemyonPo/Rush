package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double min = Double.parseDouble((reader.readLine()));
        double result = (min % 5);

        if (result < 3){
            System.out.println("зеленый");
        }else if (result >= 3 && result < 4){
            System.out.println("жёлтый");
        }else if (result >= 4){
            System.out.println("красный");
        }
    }
}