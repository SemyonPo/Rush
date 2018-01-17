package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        int x=(max(max(a,b),c));
        int v=((a+b+c)-min(min(a,b),c)-max(max(a,b),c));
        int z=(min(min(a,b),c));

        System.out.println(x+" "+v+" "+z);

    }
    public static int min(int a, int b){
        if (a<b){
            return a;
        }else return b;
    }

    public static int max(int a, int b){
        if (a>b){
            return a;
        }else return b;
    }
}
