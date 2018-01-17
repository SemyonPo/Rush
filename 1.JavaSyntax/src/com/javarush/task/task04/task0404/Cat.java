package com.javarush.task.task04.task0404;

/* 
Реализовать метод addNewCat
*/

public class Cat {
    private static int catsCount = 0;

    public static void addNewCat() {
        //напишите тут ваш код
        Cat.catsCount++;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.addNewCat();
        System.out.println(catsCount);
    }
}
