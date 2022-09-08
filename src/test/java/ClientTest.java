import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import clients.Client;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ClientTest {
    private Account testAccount1;
    private Account testAccount2;
    private Client testClient;

    @Before
    public void createNewAccountsAndClient() {
        int maximumNumberOfAccountsInClient = 1;
        testClient = new Client("John Doe", maximumNumberOfAccountsInClient);
        testAccount1 = new CheckingAccount("John Doe");
        testAccount2 = new CreditAccount("John Doe");
    }

    @Test
    public void doNotExceedTheNumberOfAccounts() {
        testClient.addNewAccount(testAccount1);
        Assert.assertFalse(testClient.addNewAccount(testAccount2));
    }
}
