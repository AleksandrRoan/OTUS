package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public static void main(String[] args) {
        Client client1 = new Client("Alex", 31);
        Account account1 = new Account();
        account1.setClient(client1);
        Account account2 = new Account();
        account2.setClient(client1);
        System.out.println(client1.getAccount());
    }

    public static List<Account> getAccount(Client client) {
        //write logic
        List<Account> accountList = new ArrayList<>();

        return new ArrayList<>();
    }
}
