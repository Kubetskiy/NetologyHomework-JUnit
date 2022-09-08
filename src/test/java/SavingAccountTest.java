import accounts.SavingAccount;
import org.junit.Assert;
import org.junit.Test;

public class SavingAccountTest {
    @Test
    public void accountMustMaintainMinimalBalance() {
        double testMinimalBalance = 1000.0;
        double exceedingTheMinimumBalance = 1.0;
        var testSavingAccount = new SavingAccount("John Doe", testMinimalBalance, testMinimalBalance);
        // Аккаунт имеет минимальный баланс
        Assert.assertFalse(testSavingAccount.pay(exceedingTheMinimumBalance));
    }
}
