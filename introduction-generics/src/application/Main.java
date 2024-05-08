package application;

import model.services.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<String> printService = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {
            String value = sc.next();
            printService.addValue(value);
        }

        printService.print();
        String x = printService.first();
        System.out.println("First: " + printService.first());

        sc.close();
    }
}