package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList();
        list.add("sd");
        list.add("er");
        list.add("ty");
        list.add("gb");
        list.add("fn");

        System.out.println(list.size());

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
