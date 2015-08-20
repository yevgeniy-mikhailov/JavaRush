package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int temp = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
