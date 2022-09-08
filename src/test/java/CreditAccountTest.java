import accounts.CreditAccount;
import org.junit.Assert;
import org.junit.Test;

public class CreditAccountTest {
    @Test
    public void balanceCannotBePositive() {
        double testPayment = 1.0;
        var testCreditAccount = new CreditAccount("John Doe");
        // Аккаунт не может иметь положительный баланс
        Assert.assertFalse(testCreditAccount.add(testPayment));
    }
}
