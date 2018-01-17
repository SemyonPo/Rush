package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int nNum = Integer.parseInt(sNum);

        if (nNum < 0){
            nNum = nNum+1;
            System.out.println(nNum);
        } else if (nNum > 0){
            nNum = nNum * 2;
            System.out.println(nNum);
        } else if (nNum == 0 ){
            nNum = 0;
            System.out.println(nNum);
        }
    }

}