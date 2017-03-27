package services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Account;
import model.Bank;
import model.Depositor;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Oleg on 25.03.2017.
 */
public class BankService {


    public double sum(Bank bank) {
        double sum = 0;

        for (Depositor d : bank.getListOfClients()) {
            for (Account acc : d.getLstOfAccount()) {
                sum += acc.getAmountOnDeposit();
            }
        }
        return sum;
    }

    public void list(Bank bank) {
        for (Depositor d : bank.getListOfClients()) {
            for (Account acc : d.getLstOfAccount()) {
                System.out.println("acc id: " + acc.getAccountId() + " sum: " + acc.getAmountOnDeposit());
            }
        }
    }

    public int count(Bank bank) {
        int cnt = 0;

        for (Depositor d : bank.getListOfClients()) {
            for (Account acc : d.getLstOfAccount()) {
                cnt++;
            }
        }
        return cnt;
    }

    public void showBank(Bank bank) {
        for (Depositor depositors : bank.getListOfClients()) {
            System.out.println(depositorInfo(depositors));
        }
    }


    public void saveData(String path, Bank bank) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        try {
            Files.write(Paths.get(path), gson.toJson(bank).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Bank loadData(String path) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        StringBuilder load = new StringBuilder();
        try {
            List<String> list = Files.readAllLines(Paths.get(path), Charset.defaultCharset());

            for (String str : list) {
                load.append(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return gson.fromJson(load.toString(), Bank.class);
    }

    public void addDepositor(Bank bank, Depositor depositor) {
        bank.getListOfClients().add(depositor);
    }

    public Depositor depositorInfo(Depositor depositor) {

        return depositor;
    }
}