package pl.sda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What is your surname?");
        String surname = sc.nextLine();
        System.out.println("What is your name?");
        int age = sc.nextInt();

        System.out.println("Name "+name+" Surname: " +surname + " Age: "+age);

    }
}
