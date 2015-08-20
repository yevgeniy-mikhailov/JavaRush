package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        int point = 0;
        int[] mass;

        while(true) {
            String temp = reader.readLine();
            try {
                if (point<Integer.parseInt(temp)) {
                    point = Integer.parseInt(temp);
                    break;
                }
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
        mass = new int[point];
        for (int i = 0; i < mass.length; i++) {
            try {
                mass[i] = Integer.parseInt(reader.readLine());
            }
            catch (Exception e)
            {
                System.out.println(e);
                i -= 1;
            }
        }
        int temp = 0;
        int max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if(max<mass[i]) {
                max = mass[i];
            }
        }
        System.out.println(max);
        //напишите здесь ваш код




        //System.out.println(maximum);
    }
}
