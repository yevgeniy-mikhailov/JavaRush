package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //Напишите тут ваш код
    private int left;
    private int right;
    private int width;
    private int height;

    public Rectangle(int left, int right, int width, int height) {
        this.left = left;
        this.right = right;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int left, int right) {
        this.left = left;
        this.right = right;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int left, int right, int width) {
        this.left = left;
        this.right = right;
        this.width = width;
        this.height = width;
    }

    public Rectangle(Rectangle rectangle) {
        this.left = rectangle.left;
        this.right = rectangle.right;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

}
