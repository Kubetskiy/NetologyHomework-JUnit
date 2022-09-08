import accounts.CheckingAccount;
import org.junit.Assert;
import org.junit.Test;

public class CheckingAccountTest {
    @Test
    public void accountMustMaintainPositiveBalance() {
        var testCheckingAccount = new CheckingAccount("John Doe");
        // Аккаунт имеет минимальный баланс (0), ниже минимума платить нельзя.
        double testPaymentAmount = 1.0;
        Assert.assertFalse(testCheckingAccount.pay(testPaymentAmount));
    }
}
