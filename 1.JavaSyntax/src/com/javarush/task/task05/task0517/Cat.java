package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public Cat(String name){
        this.name = name;
        age = 5;
        weight =3;
        color = "black";
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "white";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        weight = 7;
        color = "orange";
    }

    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        age = 2;
    }

    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 8;
    }

    public static void main(String[] args) {

    }
}
