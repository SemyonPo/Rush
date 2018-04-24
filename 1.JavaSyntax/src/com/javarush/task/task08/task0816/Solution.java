package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JULY 1 1980"));
        map.put("Stall", new Date("JUNE 2 1989"));
        map.put("Stallne", new Date("SEPTEMBER 3 1988"));
        map.put("Stalone", new Date("OCTOBER 4 1987"));
        map.put("Stalon7e", new Date("AUGUST 5 1960"));
        map.put("Stllone", new Date("AUGUST 6 1985"));
        map.put("Sallone", new Date("DECEMBER 7 1984"));
        map.put("Stallon", new Date("APRIL 8 1983"));
        map.put("Stalloe", new Date("MAY 9 1982"));
        map.put("Stall6ne", new Date("APRIL 10 1981"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            Date key = pair.getValue();
            int month = key.getMonth();
            if (month >= 5 && month <= 7){
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}
