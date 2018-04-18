package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код

        HashMap<String, String> map = new HashMap<>();
        map.put("Ab","Av");
        map.put("Ac","Aer");
        map.put("Ad","dfg");
        map.put("Ae","hj");
        map.put("Af","dg");
        map.put("Ag","lo");
        map.put("Ba","aw");
        map.put("Bc","Adf");
        map.put("Bd","Av");
        map.put("Be","Av");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код

        int tmp = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())      //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if (value.equals(name)){
                tmp++;
            }
        }
        return tmp;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int tmp = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())      //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if (key.equals(lastName)){
                tmp++;
            }
        }
        return tmp;

    }

    public static void main(String[] args) {

    }
}
