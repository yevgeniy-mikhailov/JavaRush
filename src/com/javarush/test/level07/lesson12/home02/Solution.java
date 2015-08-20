package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[2];
        ArrayList<String> list = new ArrayList<String>();

        //Напишите тут ваш код
        for (int i = 0; i < 2; i++) {
            try {
                mass[i] = Integer.parseInt(reader.readLine());
            }
            catch (Exception e) {
                System.out.println(e);
                i--;
            }
            
        }

        //System.out.println("----------------------");
        for (int i = 0; i < mass[0]; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i <mass[1]; i++) {
            list.add(list.get(0));
            list.remove(0);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
