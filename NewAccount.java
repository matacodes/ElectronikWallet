package Wallet;

import java.io.File;
import java.util.Scanner;

public class NewAccount {

    private String firstName;   // imie
    private String secondName;  // nazwisko
    private String login;       // login tworzony z imienia i nazwiska
    private String password;    // haslo


    public void Customer (String firstName, String secondName, String login, String password) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.login = login;
        this.password = password;
    }



    Scanner scanner = new Scanner(System.in);

    void setFirstName()
    {
        System.out.print("Podaj imie: ");
        firstName = scanner.next();
    }
    String getFirsName()
    {
        return firstName;
    }
    void setSecondName()
    {
        System.out.print("Podaj nazwisko: ");
        secondName = scanner.next();
    }
    String getSecondName()
    {
        return secondName;
    }

    void setLogin()
    {
        login = firstName.substring(0, 3) + secondName.substring(0, 3);
    }
    String getLogin()
    {
        return login;
    }
    void setPassword()
    {
        System.out.print("Podaj hasło do swojego konta: ");
        password = scanner.next();
    }
    String getPassword()
    {
        return password;
    }

    void newCustomer ()
    {

        System.out.println("Nowy Klient");
        setFirstName();
        setSecondName();
        setPassword();
        setLogin();
        System.out.println(getFirsName() + " " + getSecondName());
        System.out.println("Twój login to: " + getLogin());
        System.out.println("Twoje hasło to: " +getPassword());

        // File plik = new File(getLogin()+".txt");

    }
}

