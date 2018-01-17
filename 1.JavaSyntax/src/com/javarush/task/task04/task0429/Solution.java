package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sYear = reader.readLine();
        int a = Integer.parseInt(sYear);
        String sMonth = reader.readLine();
        int b = Integer.parseInt(sMonth);
        String sDate = reader.readLine();
        int c = Integer.parseInt(sDate);

        int otr = 0;
        int pol = 0;
        if (a>0 & a!=0){
            pol++;
        }else if (a<0 & a!=0){
            otr++;
        }

        if (b>0 & b!=0){
            pol++;
        }else if (b<0 & b!=0){
            otr++;
        }

        if (c>0 & c!=0){
            pol++;
        }else if (c<0 & c!=0){
            otr++;
        }

        System.out.println("количество отрицательных чисел: "+otr);
        System.out.println("количество положительных чисел: "+pol);

    }
}
