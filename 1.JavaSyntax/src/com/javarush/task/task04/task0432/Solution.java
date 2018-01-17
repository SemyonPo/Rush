package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String aNum1 = reader.readLine();
        int Num1 = Integer.parseInt(aNum1);

        int x=0;
        while (x<Num1){
            System.out.println(name);
            x++;
        }
    }
}
