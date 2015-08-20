package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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
        mapa.put("Кубасов", "Геннадий");
        mapa.put("Штерцер", "Ольга");
        mapa.put("Суббота", "Полина");
        mapa.put("Михайлюк", "Максим");
        mapa.put("Рейтер", "Ирина");

        return mapa;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //Напишите тут ваш код
        Set<String> set0 = new HashSet<String>();
        Set<String> set1 = new HashSet<String>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (set1.contains(pair.getValue())) set0.add(pair.getValue());
            else set1.add(pair.getValue());
        }
        for (String elementToDelete : set0) {
            removeItemFromMapByValue(map, elementToDelete);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
