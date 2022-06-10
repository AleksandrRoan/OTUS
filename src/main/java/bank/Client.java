package bank;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private final String name;

    private final int age;
    private final List<Account> account = new ArrayList<>();
    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAccount(Account account) {
        this.account.add(account);
    }

    public List<Account> getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
