package bank;

public class Account {
    private int coin;
    public Client client;

    public Account(int coin) {
        this.coin = coin;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Account{" +
                "coin=" + getCoin() +
                ", client=" + client +
                '}';
    }
}
