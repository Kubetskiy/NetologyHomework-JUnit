package accounts;

import clients.MoneyTarget;

public abstract class Account implements MoneyTarget {
    protected String accountOwnerName;
    protected double accountBalance;

    protected Account() {
    }

    abstract public boolean pay(double amount);

    abstract public boolean add(double amount);

    abstract public boolean transfer(Account accountTo, double amount);
}
