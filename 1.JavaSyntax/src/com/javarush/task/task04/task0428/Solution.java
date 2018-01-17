package com.javarush.task.task04.task0428;

/* 
Положительное число
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

       chek(a);
       chek(b);
       chek(c);
       if (COUNT>0){
           System.out.println(COUNT);
       }else System.out.println("0");

    }
    static int COUNT=0;
    public static void chek(int a){
        if ((a>0) & (a!=0)){
            COUNT++;
        }
    }
}
