package Wallet;

import java.util.Scanner;

class LogIn extends Customer {

    private String logOn;


    Scanner scanner = new Scanner(System.in);

    public LogIn(double balance, String logOn) {
        super(balance);
        this.logOn = logOn;
    }

    void setlogOn()
    {
        System.out.println("Podaj login: ");
        logOn = scanner.next();
    }
    String getLogOn()
    {
        return logOn;
    }


}
