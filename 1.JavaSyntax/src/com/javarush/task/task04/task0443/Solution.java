package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        String  sYear = reader.readLine();
        int y = Integer.parseInt(sYear);
        String  sMonth = reader.readLine();
        int m = Integer.parseInt(sMonth);
        String  sDate = reader.readLine();
        int d = Integer.parseInt(sDate);

        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился "+d +"."+m+"."+y);
    }
}
