package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human granpa1 = new Human("Tom", true, 88);
        Human granpa2 = new Human("Bob", true, 89);
        Human granma1 = new Human("Clara", false, 77);
        Human granma2 = new Human("Sara", false, 67);
        Human father1 = new Human("Sam", true, 55, granpa1, granma1);
        Human mother1 = new Human("An", false, 45, granpa2, granma2);
        Human child1 = new Human("Bobi", true, 6, father1, mother1);
        Human child2 = new Human("Amili", false, 12, father1, mother1);
        Human child3 = new Human("Nik", true, 25, father1, mother1);

        System.out.println(granma1);
        System.out.println(granma2);
        System.out.println(granpa1);
        System.out.println(granpa2);
        System.out.println(father1);
        System.out.println(mother1);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }

    }

}






















