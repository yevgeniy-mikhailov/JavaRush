package com.javarush.test.level08.lesson11.home09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String date = reader.readLine();
        boolean check = isDateOdd(date);
        System.out.println(date + " = " + check);
    }

    public static boolean isDateOdd(String date)
    {
        Date endDate = new Date(date);
        Date startDate = new Date("JAN 1 " + (1900 + endDate.getYear()));
        Long dater = endDate.getTime() - startDate.getTime();
        int days = (int)((dater/(24*60*60*1000)+1));
        //(if (days%2==0) ? System.out.println(1) : System.out.println(2);;
        return days%2 != 0 ? true : false;
    }
}
