package com.vanya;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Введите ваше имя: ");
        String userName = scanner.nextLine();

       
        System.out.println("Привет, " + userName + "!");

        
        scanner.close();
    }
}