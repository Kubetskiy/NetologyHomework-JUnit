import accounts.CreditAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditAccountTest {
    @Test
    public void balanceCannotBePositive() {
        double testPayment = 1.0;
        var testCreditAccount = new CreditAccount("John Doe");
        // Аккаунт не может иметь положительный баланс
        Assertions.assertFalse(testCreditAccount.add(testPayment));
    }
}
