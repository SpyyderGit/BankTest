package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg on 25.03.2017.
 */
public class Depositor {
    String name;
    List<Account> lstOfAccount = new ArrayList<>();

    public Depositor(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getLstOfAccount() {
        return lstOfAccount;
    }

    @Override
    public String toString() {
        return "Depositor{" +
                "name='" + name + '\'' +
                ", account=" + lstOfAccount +
                '}';
    }
}
