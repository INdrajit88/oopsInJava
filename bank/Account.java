package bank;
import java.util.*;

public class Account {
    public String name;
    protected String email;
    private String password;

    // getter and setter
    public String getPassword() {
        setPassword("xyz");
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Indrajit Ari";
        account1.email = "indrajitari440@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
// public can access from anywhere
// protected can access from same package and subclass
// default can access from same package
// private can access from same class only
