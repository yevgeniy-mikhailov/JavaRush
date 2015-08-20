package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[3];
        for (int i = 0; i < 3; i++) {
            mass[i] = Integer.parseInt(reader.readLine());

        }

/*        int temp = 0;
        for (int k = 0; k < mass.length-1; k++) {
            for (int l = 0; l < mass.length-k-1; l++) {
                if (mass[l] > mass[l+1]){
                    temp=mass[l];
                    mass[l]=mass[l+1];
                    mass[l+1]= temp;
                }
            }

        }
        */
        int min;
        for (int k = 0; k < mass.length-1; k++) {
            for (int l = 0; l < mass.length-k-1; l++) {
                if (mass[l]>mass[l+1]){
                    min=mass[l];
                    mass[l]=mass[l+1];
                    mass[l+1]= min;
                }
            }

        }
            System.out.println(mass[1]);
    }
}
