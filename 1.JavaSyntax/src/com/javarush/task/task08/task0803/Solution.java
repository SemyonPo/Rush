package com.javarush.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
Коллекция HashMap из котов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats) {
        //напишите тут ваш код
        HashMap<String, Cat> list = new HashMap<String, Cat>();
        Cat cat1 = new Cat(cats[0]);
        list.put(cats[0],cat1);
        Cat cat2 = new Cat(cats[1]);
        list.put(cats[1],cat2);
        Cat cat3 = new Cat(cats[2]);
        list.put(cats[2],cat3);
        Cat cat4 = new Cat(cats[3]);
        list.put(cats[3],cat4);
        Cat cat5 = new Cat(cats[4]);
        list.put(cats[4],cat5);
        Cat cat6 = new Cat(cats[5]);
        list.put(cats[5],cat6);
        Cat cat7 = new Cat(cats[6]);
        list.put(cats[6],cat7);
        Cat cat8 = new Cat(cats[7]);
        list.put(cats[7],cat8);
        Cat cat9 = new Cat(cats[8]);
        list.put(cats[8],cat9);
        Cat cat10 = new Cat(cats[9]);
        list.put(cats[9],cat10);
        return list;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
