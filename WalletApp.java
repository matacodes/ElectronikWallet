package Wallet;

import java.util.Scanner;

public class WalletApp {
    public static void main(String[] args) {

        System.out.println("Witaj w Aplikacji Bankowej");
        WalletMenu Menu = new WalletMenu();
        Menu.menu();

    }
}

