package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int num = Integer.parseInt(s);

        int a;

        while (num > 0){
            a = num%10;
            if (a%2 == 0) {
            Solution.even ++;
            }else Solution.odd ++;
            num = num/10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
