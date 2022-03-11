package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: " + "\n");
        while (true) {
            int n = scan.nextInt();
            numberToWord(n);
        }
    }
    public static String numberToWord(int number){
            int b = number % 100 / 10;
            int c = number % 10;
            if (number <= 19 && number >= 11) {
                switch (number) {
                    case 11:
                        System.out.println("одинадцать лет");
                        break;
                    case 12:
                        System.out.println("двенадцать лет");
                        break;
                    case 13:
                        System.out.println("тринадцать лет");
                        break;
                    case 14:
                        System.out.println("четырнадцать лет");
                        break;
                    case 15:
                        System.out.println("пятнадцать лет");
                        break;
                    case 16:
                        System.out.println("шестнадцать лет");
                        break;
                    case 17:
                        System.out.println("семнадцать лет");
                        break;
                    case 18:
                        System.out.println("восемнадцать лет");
                        break;
                    case 19:
                        System.out.println("девятнадцать лет");
                        break;

                }
            } else {
                switch (b) {
                    case 1:
                        System.out.print("десять лет");
                        break;
                    case 2:
                        System.out.print("двадцать");
                        break;
                    case 3:
                        System.out.print("тридцать");
                        break;
                    case 4:
                        System.out.print("сорок");
                        break;
                    case 5:
                        System.out.print("пятьдесят");
                        break;
                    case 6:
                        System.out.print("шестьдесят");
                        break;
                    case 7:
                        System.out.print("семьдесят");
                        break;
                    case 8:
                        System.out.print("восемьдесят");
                        break;
                    case 9:
                        System.out.print("девяносто");
                        break;
                }
                System.out.print(" ");
                switch (c) {
                    case 1:
                        System.out.print("один год");
                        break;
                    case 2:
                        System.out.print("два года");
                        break;
                    case 3:
                        System.out.print("три года");
                        break;
                    case 4:
                        System.out.print("четыре года");
                        break;
                    case 5:
                        System.out.print("пять лет");
                        break;
                    case 6:
                        System.out.print("шесть лет");
                        break;
                    case 7:
                        System.out.print("семь лет");
                        break;
                    case 8:
                        System.out.print("восемь лет");
                        break;
                    case 9:
                        System.out.print("девять лет");
                        break;
                }
            }
return (null);
    }
}



