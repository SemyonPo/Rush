package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int res = a + b;
        return res;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int res = a - b;
        return res;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int res = a * b;
        return res;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double res = (double) a / b;
        return res;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        double res = (double) a / 100 * b;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Calculator.percent(5, 2));

    }
}