package GB_Java_Seminar02;

import java.util.Scanner;

public class Seminar02 {
    public static void main(String[] args) {
        // Задание 1.
        // Написать программу, которая запрашивает на ввод две строки
        // После проверяет, равны ли эти строки по содержан.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert string № 1 = ");
        String firstString = scanner.nextLine();
        System.out.print("Insert String № 2 = ");
        String secondString = scanner.nextLine();
        System.out.println("Strings " + (firstString.equals(secondString) ? "equals" : "not equals"));


        // Задание 2.
        // Написать программу, которая запрашиваент на ввод две строик
        // После проверяет, являются ли эти строк равны со вращением друг другу
        // Одна прямая, вторая такая же, но с конца.
        System.out.print("Insert string № 1 = ");
        StringBuilder stringBuilderOne = new StringBuilder(scanner.nextLine());
        System.out.println(stringBuilderOne);
        System.out.print("Insert String № 2 = ");
        StringBuilder stringBuilderTwo = new StringBuilder(scanner.nextLine());
        System.out.println(stringBuilderTwo);
        String firstStringBuilder = stringBuilderOne.toString();
        String secondStringBuilder = stringBuilderTwo.reverse().toString();
        System.out.println("Strings " + (firstStringBuilder.equals(secondStringBuilder)
                ? "equals reverse" : "not equals reverse"));
    }
}
