package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            int numberStudentsA = sc.nextInt();
            a.add(numberStudentsA);
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();

        for (int i=0; i<n; i++) {
            int numberStudentsB = sc.nextInt();
            b.add(numberStudentsB);
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();

        for (int i=0; i<n; i++) {
            int numberStudentsC = sc.nextInt();
            c.add(numberStudentsC);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());

        sc.close();

    }
}