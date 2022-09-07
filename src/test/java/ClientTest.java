import accounts.CheckingAccount;
import accounts.CreditAccount;
import clients.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClientTest {
    @Test
    public void doNotExceedTheNumberOfAccounts() {
        var testAccount1 = new CheckingAccount("John Doe");
        var testAccount2 = new CreditAccount("John Doe");
        var testClient = new Client("John Doe", 1);
        testClient.addNewAccount(testAccount1);
        Assertions.assertFalse(testClient.addNewAccount(testAccount2));
    }
}
