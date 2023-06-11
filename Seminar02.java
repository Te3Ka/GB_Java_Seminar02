import java.util.Scanner;

public class Seminar02 {
    public static void main(String[] args) {
        // Написать программу, которая запрашивает на ввод две строки
        // После проверяет, равны ли эти строки по содержан.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert string № 1 = ");
        String firstString = scanner.nextLine();
        System.out.print("Insert String № 2 = ");
        String secondString = scanner.nextLine();

        System.out.println("Strings " + (firstString.equals(secondString) ? "equals" : "not equals"));
    }
}
