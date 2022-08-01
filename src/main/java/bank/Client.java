package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private final String name;
    private final int age;
    private final List<Account> account = new ArrayList<>();

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addAccount(Account account) {
        this.account.add(account);
        account.setClient(this);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
