package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        /*
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.addAll(list);
        Collections.sort(list2);
        */

        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.get(i++));
        }
        return list;
    }
}
