package bank;

import java.util.List;

public class Bank {
    public static void main(String[] args) {
        Client client1 = new Client("Alex", 31);
        Account account1 = new Account(100);
        Account account2 = new Account(200);
        System.out.println(account1);
        client1.addAccount(account1);
        client1.addAccount(account2);
        System.out.println(getAccounts(client1));
        System.out.println(findClient(account1));
        System.out.println(findClient(account2));
    }

    public static List<Account> getAccounts(Client client) {
        return client.getAccount();
    }

    public static Client findClient(Account account) {
        return account.getClient();
    }
}
