package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine(); //папин папа
        Cat catGrandfather = new Cat(grandfatherName, null, null);

        String grandmotherName = reader.readLine(); //мамина мама
        Cat catGrandmother = new Cat(grandmotherName, null, null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandfather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentMother;
        private Cat parentFather;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentMother, Cat parentFather) {
            this.name = name;
            this.parentMother = parentMother;
            this.parentFather = parentFather;
        }

        @Override
        public String toString() {
            String res = "Cat name is " + name;

            if (parentMother == null){
                res += ", no mother";
            } else res += ", mother is " + parentMother.name;

            if (parentFather == null){
                res += ", no father";
            }else res += ", father is " + parentFather.name;
            return res;

            /*if (parentMother == null && parentFather == null)
                return "Cat name is " + name + ", no mother, no father";
            else if (parentMother == null)
                return "Cat name is " + name + ", no mother, father is " + parentFather.name;
            else if (parentFather == null)
                return "Cat name is " + name + ", mother is " + parentMother.name + ", no father";
            else
               return  "Cat name is " + name + ", mother is " + parentMother + ", father is" + parentFather;
               */
        }
    }

}
