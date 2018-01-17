package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String[] s = new String[3];
        s[0] = "Мама";
        s[1] = "Mыла";
        s[2] = "Раму";

        for(int i =0; i<3;i++)
            for(int j = 0; j<3;j++)
                for(int z = 0; z<3; z++)
                    if(i!=j && i!=z && j!=z)
                        System.out.println(s[i]+s[j]+s[z]);
    }
}
