package com.javarush.task.task08.task0818;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 200);
        map.put("b", 250);
        map.put("c", 300);
        map.put("d", 350);
        map.put("e", 400);
        map.put("f", 450);
        map.put("g", 500);
        map.put("h", 550);
        map.put("j", 600);
        map.put("r", 650);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        //for (Map.Entry<String, Integer> pair : map.entrySet()) {
        //    if (pair.getValue() < 500)
        //        map.remove(pair.getKey());
        //}

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Integer> pair = iterator.next();
            Integer value = pair.getValue();
            if (value < 500){
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}