package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here - напиши код тут
        Map<Integer, String> mapa = new HashMap<Integer, String>();
        mapa.put(1, "January");
        mapa.put(2, "February");
        mapa.put(3, "March");
        mapa.put(4, "April");
        mapa.put(5, "May");
        mapa.put(6, "June");
        mapa.put(7, "July");
        mapa.put(8, "August");
        mapa.put(9, "September");
        mapa.put(10, "October");
        mapa.put(11, "November");
        mapa.put(12, "December");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String searchMonth = reader.readLine();
        String result = null;
        Iterator<Map.Entry<Integer, String>> iterator = mapa.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, String> pair = iterator.next();
            if (searchMonth.equals(pair.getValue())) result = searchMonth + " is " + pair.getKey()+ " month";
        }
        if (result==null) {
            System.out.println("Совпадений не найдено.");
        }
        else
            System.out.println(result);
    }

}
