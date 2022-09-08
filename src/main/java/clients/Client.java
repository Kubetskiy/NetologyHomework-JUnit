package clients;

import accounts.*;

public class Client implements MoneyTarget {
    private final String bankClientName;
    private final Account[] accounts;

    public Client(String bankClientName, int maximumNumberOfAccountsAllowed) {
        this.bankClientName = bankClientName;
        accounts = new Account[maximumNumberOfAccountsAllowed];
    }

    public boolean addNewAccount(Account someAccount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = someAccount;
                return true;
            }
        }
        return false;
    }

    public boolean pay(double amount) {
        for (Account acc : accounts) {
            if (acc.pay(amount)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(double money) {
        for (Account acc : accounts) {
            if (acc.add(money)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Account acc : accounts) {
            output.append(acc.toString());
        }
        return output.toString();
    }
}
