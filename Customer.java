package Wallet;

public class Customer extends NewAccount{

    private double balance;     // saldo


    public Customer (double balance)
    {
        this.balance = balance;

    }

    void Balance() // sprawdzanie salda
    {
        System.out.println("Saldo Twojego konta wynosi: " + balance);

    }
    double Payment (double cash) // wpłata
    {
        System.out.println("Podaj kwotę wpłaty: ");
        cash = scanner.nextDouble();
        balance += cash;
        return balance;
    }

    double Withdrawal (double cash) //wypłata
    {
        do {
            System.out.println("Podaj kwotę wypłaty: ");
            cash = scanner.nextDouble();
            if (balance >= cash) {
                balance -= cash;
            } else {
                System.out.println("Nie masz wystarczająco środków na koncie");
                System.out.println("Twoje saldo wynosi: " + balance);
            }
        }
        while (balance < cash);

        return balance;
    }






}
