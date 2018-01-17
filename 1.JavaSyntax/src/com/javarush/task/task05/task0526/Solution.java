package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Vasya", 34, "Shyshkina");
        man1.print();
        Man man2 = new Man("Vitya", 23, "Ozorskya");
        man2.print();

        Woman woman1 = new Woman("Olya", 18, "Tretya");
        woman1.print();
        Woman woman2 = new Woman("Ira", 30, "Pyshkina");
        woman2.print();

    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void print(){
            System.out.println(name+ " " +age+ " " +address);
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void print(){
            System.out.println(name+ " " +age+ " " +address);
        }
    }
}
