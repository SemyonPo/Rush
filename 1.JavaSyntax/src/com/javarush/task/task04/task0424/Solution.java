package com.javarush.task.task04.task0424;

/* 
Три числа
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

        String s1 ="1";
        String s2 ="2";
        String s3 ="3";
        if (b==c & b!=a){
            System.out.println(s1);
        }else if (a==c & c!=b){
            System.out.println(s2);
        }else if (a==b & b!=c){
            System.out.println(s3);
        }
    }
}
