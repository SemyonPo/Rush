package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int a;
        if (age > anotherCat.age){
            a = 1;
        }else a = 0;

        int b;
        if (weight > anotherCat.weight){
            b = 1;
        }else b=0;

        int c;
        if (strength > anotherCat.strength){
            c = 1;
        }else c = 0;
        int score = a+b+c;
        return score > 2;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 3;
        cat1.name = "Tomas";
        cat1.weight = 5;
        cat1.strength = 7;

        Cat cat2 = new Cat();
        cat2.age = 5;
        cat2.name = "Ball";
        cat2.weight = 7;
        cat2.strength = 8;

        System.out.println(cat2.fight(cat1));
    }
}
