package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String s="S";
        int x=10;
        while (x>0){
            int z=10;
            while (z>0){
                System.out.print(s);
                z--;
            }
            System.out.println();
            x--;
        }
    }
}
