package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name){
        this.name = name;
        this.age = 7;
        this.weight = 3;
        this.color = "brown";
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "grey";
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        weight = 2;
        color = "dark";
    }

    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        age = 5;
    }

    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 7;
    }

    public static void main(String[] args) {

    }
}
