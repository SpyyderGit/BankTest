package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg on 25.03.2017.
 */
public class Bank {
    private String name;
    private String country;
    private List<Depositor> listOfClients = new ArrayList<>();


    public Bank(String name, String country) {
        this.name = name;
        this.country = country;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Depositor> getListOfClients() {
        return listOfClients;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
