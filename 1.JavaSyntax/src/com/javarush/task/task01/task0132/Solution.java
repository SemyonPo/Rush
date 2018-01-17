package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int sum;
        int a = 0;
        for (int i = 0; i < 3; i++) { //код делящий
            sum = number % 10;    //трехзначное целое число
            number = number / 10; //на десятичные числа

            a += sum;               //происходит подсчет суммы чисел
        }
        return a;
    }
}