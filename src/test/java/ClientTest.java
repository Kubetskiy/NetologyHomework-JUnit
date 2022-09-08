import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import clients.Client;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ClientTest {
    private Account testAccount1;
    private Account testAccount2;
    private Client testClient;

    @BeforeEach
    public void createNewAccountsAndClient() {
        int maximumNumberOfAccountsInClient = 1;
        testClient = new Client("John Doe", maximumNumberOfAccountsInClient);
        testAccount1 = new CheckingAccount("John Doe");
        testAccount2 = new CreditAccount("John Doe");
    }

    @Test
    @DisplayName("Client cannot exceed the specified number of accounts")
    public void doNotExceedTheNumberOfAccounts() {
        testClient.addNewAccount(testAccount1);
        assertFalse(testClient.addNewAccount(testAccount2));
    }
}
