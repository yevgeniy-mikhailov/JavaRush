package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human Child1 = new Human("Vasya", true, 6);
        Human Child2 = new Human("Leps", true, 9);
        Human Child3 = new Human("Lisya", false, 11);
        ArrayList<Human> childs = new ArrayList<Human>();
        ArrayList<Human> fathers = new ArrayList<Human>();
        ArrayList<Human> mothers = new ArrayList<Human>();
        Collections.addAll(childs, Child1, Child2, Child3);
        Human Father = new Human("PAPA", true, 37, childs);
        fathers.add(Father);
        Human Mother = new Human("MAMA", false, 35, childs);
        mothers.add(Mother);
        Human GrandFather1 = new Human("DED1", true, 60, fathers);
        Human GrandFather2 = new Human("DED2", true, 61, mothers);
        Human GrandMother1 = new Human("BABKA1", false, 58, fathers);
        Human GrandMother2 = new Human("BABKA2", false, 59, mothers);

        System.out.println(Child1.toString());
        System.out.println(Child2.toString());
        System.out.println(Child3.toString());
        System.out.println(Father.toString());
        System.out.println(Mother.toString());
        System.out.println(GrandFather1.toString());
        System.out.println(GrandFather2.toString());
        System.out.println(GrandMother1.toString());
        System.out.println(GrandMother2.toString());

    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList(children);
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }
}
