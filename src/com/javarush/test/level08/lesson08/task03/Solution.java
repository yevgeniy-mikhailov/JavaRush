package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String, String> mapa = new HashMap<String, String>();
        mapa.put("Укупник", "Аркадий");
        mapa.put("Шабанов", "Максим");
        mapa.put("Куличев", "Геннадий");
        mapa.put("Кучинская", "Янина");
        mapa.put("Толокина", "Елена");
        mapa.put("Кубасов", "Иван");
        mapa.put("Штерцер", "Ольга");
        mapa.put("Суббота", "Полина");
        mapa.put("Михайлюк", "Сергей");
        mapa.put("Рейтер", "Ирина");

        return mapa;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //Напишите тут ваш код
        int temp = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (name.equals(pair.getValue())) temp++;
        }
        return temp;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //Напишите тут ваш код
        int temp = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (familiya.equals(pair.getKey())) temp++;
        }
        return temp;

    }
}
