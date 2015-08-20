package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        public boolean sex;
        public String fName;
        public int weight;
        public int height;
        public int age;
        public String lName;

        public Human(boolean sex, String fName, int weight, int height, int age, String lName) {
            this.sex = sex;
            this.fName = fName;
            this.weight = weight;
            this.height = height;
            this.age = age;
            this.lName = lName;
        }

        public Human(String lName, String fName, int age, int height, int weight) {
            this.lName = lName;
            this.fName = fName;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String lName, String fName, boolean sex, int age) {

            this.lName = lName;
            this.fName = fName;
            this.sex = sex;
            this.age = age;
        }

        public Human(String fName, String lName, int age) {

            this.fName = fName;
            this.lName = lName;
            this.age = age;
        }

        public Human(String fName, String lName) {
            this.fName = fName;
            this.lName = lName;

        }

        public Human(boolean sex, String fName, String lName) {
            this.sex = sex;
            this.fName = fName;
            this.lName = lName;
        }

        public Human(String lName, String fName, int weight, int height) {
            this.lName = lName;
            this.fName = fName;
            this.weight = weight;
            this.height = height;
        }

        public Human(int height, String fName, int weight, int age) {
            this.height = height;
            this.fName = fName;
            this.weight = weight;
            this.age = age;
        }

        public Human(String fName, int age) {

            this.fName = fName;
            this.age = age;
        }

        public Human(String fName, boolean sex, int age) {

            this.fName = fName;
            this.sex = sex;
            this.age = age;
        }
    }
}
