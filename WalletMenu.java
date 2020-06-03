package Wallet;

import java.util.Scanner;

public class WalletMenu
{
    void menu () {

        int option;

        do {
            System.out.println(" Menu");
            System.out.println("1. Logowanie.");
            System.out.println("2. Dodaj nowe konto.");
            System.out.println("3. Wyjście");

            Scanner choice = new Scanner(System.in);
            System.out.println("Wprowadź: ");
            option = choice.nextInt();

            switch (option) {
                case 1:
                    System.out.println("LOGOWANIE");
                    break;

                case 2:
                    NewAccount customer = new NewAccount();
                    customer.newCustomer();
                    System.out.println("Konto zostało utworzone. ");
                    break;

                case 3:
                    System.out.println("KONIEC");
                    break;
                default:
                    System.out.println("WYBRAŁEŚ NIEPOPRAWNĄ OPCJE");
            }
        }
        while (option != 3);
        System.out.println("Do następnego razu");

    }

    }


