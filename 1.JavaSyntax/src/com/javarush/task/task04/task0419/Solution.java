package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aNum = reader.readLine();
        int  nNum = Integer.parseInt(aNum);
        String aNum1 = reader.readLine();
        int  nNum1 = Integer.parseInt(aNum1);
        String aNum2 = reader.readLine();
        int  nNum2 = Integer.parseInt(aNum2);
        String aNum3 = reader.readLine();
        int  nNum3 = Integer.parseInt(aNum3);

        int x=0;
        int z=0;

        if (nNum>nNum1){
            x=nNum;
        }else x=nNum1;

        if (nNum2>nNum3){
            z=nNum2;
        }else z=nNum3;

        if (x>z){
            System.out.println(x);
        }else System.out.println(z);
    }
}
