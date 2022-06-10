package bank;

public class Bank {
    public static void main(String[] args) {
        Client client1 = new Client("Alex", 31);
        Account account1 = new Account();
        Account account2 = new Account();
        System.out.println(account1);
        client1.setAccount(account1);
        client1.setAccount(account2);
        System.out.println(client1.getAccount());
    }
}
