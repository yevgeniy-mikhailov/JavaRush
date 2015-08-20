package com.javarush.test.level08.lesson08.task01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //Напишите тут ваш код
        HashSet<String> set = new HashSet<String>();
        Collections.addAll(set, "Лагуна", "Лезвие", "Ласта", "Лапша", "Лезгинка", "Лапа", "Либрум", "Лафки-чмафки", "Лепелтуал", "Лобот",
                "Лягушка", "Лимон", "Леха", "Ливерпуль", "Линза", "Лес", "Лесоруб", "Летчик", "Лепешка", "Лазанья");
        return set;

    }
}
