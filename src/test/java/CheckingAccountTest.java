import accounts.CheckingAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckingAccountTest {
    @Test
    @DisplayName("Аккаунт имеет минимальный баланс (0), ниже минимума платить нельзя.")
    public void accountMustMaintainPositiveBalance() {
        var testCheckingAccount = new CheckingAccount("John Doe");
        // Аккаунт имеет минимальный баланс (0), ниже минимума платить нельзя.
        double testPaymentAmount = 1.0;
        Assertions.assertFalse(testCheckingAccount.pay(testPaymentAmount));
    }
}
