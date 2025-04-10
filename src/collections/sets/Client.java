package collections.sets;

import java.util.Objects;

public class Client implements Comparable<Client>{
    private String name;
    private String account;
    private byte age;
    private double balance;

    public Client(String name, String account, byte age, double balance) {
        this.name = name;
        this.account = account;
        this.age = age;
        this.balance = balance;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return name + " " + account + " " + age + " " + balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(account, client.account);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(account);
    }

    @Override
    public int compareTo(Client o) {
        if (this.name.compareTo(o.name) > 0) return 1;
        else if (this.name.compareTo(o.name) < 0) return -1;
        else if (this.age > o.age) return 1;
        else if (this.age < o.age) return -1;
        else return 0;
    }
}