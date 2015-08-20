package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import sun.util.calendar.BaseCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM YYYY");
        System.out.println(sdf.format(new Date()));
    }
}
