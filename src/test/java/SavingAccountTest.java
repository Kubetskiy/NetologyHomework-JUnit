import accounts.SavingAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingAccountTest {
    @Test
    public void accountMustMaintainMinimalBalance() {
        double testMinimalBalance = 1000.0;
        double exceedingTheMinimumBalance = testMinimalBalance + 1.0;
        var testSavingAccount = new SavingAccount("John Doe", testMinimalBalance, testMinimalBalance);
        // Аккаунт имеет минимальный баланс
        Assertions.assertFalse(testSavingAccount.pay(exceedingTheMinimumBalance));
    }
}
