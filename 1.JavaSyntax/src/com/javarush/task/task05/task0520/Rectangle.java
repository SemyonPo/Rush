package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    private int top;
    private int left;
    private int width;
    private int height;
    private int len;

    public Rectangle(int left, int top){
        this.left = left;
        this.top = top;
    }

    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public Rectangle(int len){
        width = height = top =len;
    }

    public Rectangle(){

    }

    public static void main(String[] args) {

    }
}
