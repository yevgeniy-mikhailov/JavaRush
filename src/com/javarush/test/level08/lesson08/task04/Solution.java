package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

    /* Удалить всех людей, родившихся летом
    Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
    Удалить из словаря всех людей, родившихся летом.
    */

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Квадрапоне", new Date("JUNE 1 1982"));
        map.put("Страпоне", new Date("OCTOBER 1 1987"));
        map.put("Триколоне", new Date("JULY 3 1990"));
        map.put("Астрахоне", new Date("AUGUST 7 1981"));
        map.put("Алькапоне", new Date("SEPTEMBER 1 1980"));
        map.put("Крабофоне", new Date("FEBRUARY 1 1986"));
        map.put("Чиполине", new Date("JUNE 1 1992"));
        map.put("Гидропоне", new Date("JUNE 1 1995"));
        map.put("Кильконе", new Date("JUNE 1 1999"));

        //Напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //Напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8) {
                iterator.remove();
            }
        }
/*        for (Map.Entry<String, Date> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue() + " ---- " + pair.getValue().getMonth());
            }*/
    }
}
