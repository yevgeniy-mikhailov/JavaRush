package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<Human> humans = new ArrayList<Human>();
        while (true)
        {
            String address = reader.readLine();
            if (address.isEmpty()) break;

            String family = reader.readLine();
            Human humangosaur = new Human(family, address);
            humans.add(humangosaur);
        }

        String searchState = reader.readLine();
        for (Human hum : humans) {
            if (searchState.equals(hum.address))
            System.out.println(hum.family);
        }
    }
    public static class Human {
        String family;
        String address;

        public Human(String family, String address) {
            this.address = address;
            this.family = family;
        }


    }
}
