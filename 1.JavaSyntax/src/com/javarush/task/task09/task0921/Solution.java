package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        List<Integer> num = new ArrayList<>();
        for (int i=0; i<num.size(); i++) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String a = null;
            try {
                a = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int b = Integer.parseInt(a);
            num.add(b);
        }
    }
}
