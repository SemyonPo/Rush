package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

       String s1 = "четное однозначное число";
       String s2 = "нечетное однозначное число";
       String s3 = "четное двузначное число";
       String s4 = "нечетное двузначное число";
       String s5 = "четное трехзначное число";
       String s6 = "нечетное трехзначное число";

      if (a>0 && (a/10==0) && (a%2==0)){
          System.out.println(s1);

      }else if (a>0 && (a/10==0) && (a%2!=0)){
          System.out.println(s2);

      }else if (a>0 && (a/100==0) && (a%2==0)){
          System.out.println(s3);

      }else if (a>0 && (a/100==0) && (a%2!=0)){
          System.out.println(s4);

      }else if (a>0 && (a/1000==0) && (a%2==0)){
          System.out.println(s5);

      }else if (a>0 && (a/1000==0) && (a%2!=0)){
          System.out.println(s6);
      }
    }
}
