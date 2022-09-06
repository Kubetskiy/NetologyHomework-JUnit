import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingAccount;
import clients.Client;
/*
 * Абстракции и интерфейсы
 */
public class Main {
    public static void main(String[] args) {
// Создаем клиента, максимум на 3 аккаунта
        Client testClient = new Client("Почтальон Печкин", 3);

        CreditAccount crAcc = new CreditAccount("Почтальон Печкин");
        if (!testClient.addNewAccount(crAcc)) {
            System.out.println("Блольше счетов добавить нельзя");
        }

        CheckingAccount chkAcc = new CheckingAccount("Почтальон Печкин");
        if (!testClient.addNewAccount(chkAcc)) {
            System.out.println("Блольше счетов добавить нельзя");
        }

        SavingAccount savAcc = new SavingAccount("Почтальон Печкин", 3000, 1500);
        if (!testClient.addNewAccount(savAcc)) {
            System.out.println("Блольше счетов добавить нельзя");
        }

        CheckingAccount chkAcc1 = new CheckingAccount("Почтальон Печкин");
        if (!testClient.addNewAccount(chkAcc1)) {
            System.out.println("Блольше счетов добавить нельзя\n");
        }
// Смотрим, что насоздавалось
        System.out.println("\nПеред тестом");
        System.out.println(testClient);
// Проверяем transfer КредАкк -> ЧекингАкк
        System.out.println("\nПеревод $999 с Кредита на Чекинг");
        if (!crAcc.transfer(chkAcc, 999)) {
            System.out.println("Трансфер неудачен");
        }
        System.out.println(testClient);
// acceptMoney
        System.out.println("\nДва зачисления - $1000 и $888");
        if(!testClient.acceptMoney(1000)) {
            System.out.println("Зачисление неудачно");
        }
        if(!testClient.acceptMoney(888)) {
            System.out.println("Зачисление неудачно");
        }
// Смотрим результат
        System.out.println(testClient);

        chkAcc.transfer(savAcc,2000.55);
        System.out.println(testClient);
    }
}
