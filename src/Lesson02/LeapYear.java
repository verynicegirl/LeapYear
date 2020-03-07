package Lesson02;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Введите год в формате ГГГГ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0) ;
        else if (year % 400 == 0 && year % 100 != 0) {
            System.out.println("Это високосный год");
        }
        else{
            System.out.println("Это не високосный год");
        }
    }
}

