package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String Num = reader.readLine();
        int a = Integer.parseInt(Num);
        String Num1 = reader.readLine();
        int b = Integer.parseInt(Num1);
        String Num2 = reader.readLine();
        int c = Integer.parseInt(Num2);

        if (min(a,b)==min(b,c)){
            System.out.println(max(min(a,c),min(b,a)));
        }else System.out.println(max(min(a,b),min(b,c)));
        //System.out.println((a+b+c)-min(min(a,b),c)-max(max(a,b),c));

    }
    public static int min(int z, int x) {
        if (z<x){
            return z;
        }else return x;
    }

    public static int max(int z, int x){
        if (z>x){
            return z;
        }else return x;
    }
}
