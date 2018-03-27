package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        /*
        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            listUpperCase.add(s.toUpperCase());
        }
        */

        ArrayList<String> listModified = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            String buf = (list.get(i));

            if (buf.length() % 2 == 0){
                listModified.add(buf + " " + buf);
            }else {
                listModified.add(buf + " " + buf + " " + buf );
            }
        }

        for (int i = 0; i < listModified.size(); i++) {
            System.out.println(listModified.get(i));
        }
    }
}
