package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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

        if (nNum1 == nNum2 && nNum1 == nNum3) {
            System.out.print(nNum1 + " " + nNum2 + " " + nNum3);
        }
            else if (nNum1 == nNum2) {
            System.out.println(nNum1 + " " + nNum2);
        }
            else if(nNum1 == nNum3) {
            System.out.print(nNum1 + " " + nNum3);
        }
            else if (nNum2 == nNum3) {
            System.out.print(nNum2 + " " + nNum3);
        }
    }
}