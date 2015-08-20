package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в одной строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int numI = 1;
        int numJ = 1;
        while (numI<=10) {
            while (numJ <=10) {
                System.out.print("S");
                numJ++;
            }
            numJ=1;
            numI++;
            System.out.println();
        }

    }
}
