package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
        this.age=age;
        this.name=name;
        this.weight=weight;
        this.strength=strength;
    }

    public boolean fight(Cat anotherCat)
    {
        //Напишите тут ваш код
        int check= 0;
        if (this.weight>anotherCat.weight) check++;
        if (this.strength>anotherCat.strength) check++;
        if (this.age<anotherCat.age) check++;
        if (check>1) {
            System.out.println(this.name + "  win!");
            return true;
        }
        else {
            System.out.println(anotherCat.name+" win!");
            return false;
        }
    }

    public static void main(String[] args) {
        Cat Vasya = new Cat();
        Vasya.name = "Vasya";
        Vasya.age=4;
        Vasya.strength= 228;
        Vasya.weight = 7;
        Cat Pups = new Cat();
        Pups.name = "Pups";
        Pups.age=5;
        Pups.strength= 215;
        Pups.weight = 7;
        Vasya.fight(Pups);

    }
}
