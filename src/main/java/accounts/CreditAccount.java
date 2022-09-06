package accounts;

/*
TODO Annual Percentage Rate (APR) 13.74%

На входе конструктора ID, кредитный лимит, годовая процентная ставка.
Ставка и лимит не константы, определяются при заключении договора на карту.
 */
public class CreditAccount extends Account {
    public CreditAccount(String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
    }

    @Override
    public boolean withdrawFromAccount(double amount) {
        accountBalance -= amount;
        return true;
    }

    @Override
    public boolean transfer(Account account, double amount) {
        if (account.acceptMoney(amount)) {
            return withdrawFromAccount(amount);
        }
        return false;
    }

    @Override
    public boolean acceptMoney(double amount) {
        if (amount + accountBalance > 0) {
            return false;
        }
        accountBalance += amount;
        return true;
    }

    @Override
    public String toString() {
        return String.format("""
                                                
                        CREDIT Account
                        Account owner: %20s
                        Account balance: $%,(17.2f""",
                this.accountOwnerName, this.accountBalance);
    }

    public String getAccountOwnerName() {
        return this.accountOwnerName;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }
}
