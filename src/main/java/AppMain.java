
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Account;
import model.Bank;
import model.Depositor;
import model.Type;
import services.AccountService;
import services.BankService;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by Oleg on 25.03.2017.
 */
public class AppMain {
    public static void main(String[] args) {


        BankService bankService = new BankService();
        AccountService accountService = new AccountService();

        Bank bank = bankService.loadData("C:/tmp/tmp.json");


        System.out.println(bankService.sum(bank));
        bankService.showBank(bank);
        accountService.delete(bank.getListOfClients().get(0),1);
        bankService.showBank(bank);


//        Depositor vasya = new Depositor("Vasya");
//        Account account1 = new Account(1, 2355.5, 10, 3, Type.urgent);
//        Account account2 = new Account(2, 2355.5, 10, 3, Type.urgent);
//        Account account3 = new Account(3, 2355.5, 10, 3, Type.urgent);
//        accountService.addDeposit(bank, vasya, account1);
//        accountService.addDeposit(bank, vasya, account2);
//        accountService.addDeposit(bank, vasya, account3);
//
//        bankService.addDepositor(bank, vasya);
//
//
//        Depositor petya = new Depositor("Petya");
//        Account accountPetya1 = new Account(4, 6355.5, 16, 3, Type.calc);
//        Account accountPetya2 = new Account(5, 6355.5, 16, 3, Type.calc);
//        Account accountPetya3 = new Account(6, 6355.5, 16, 3, Type.calc);
//
//        accountService.addDeposit(bank, petya, accountPetya1);
//        accountService.addDeposit(bank, petya, accountPetya2);
//        accountService.addDeposit(bank, petya, accountPetya3);
//        bankService.addDepositor(bank, petya);
//
//        bankService.showBank(bank);
//
//        System.out.println();
//        accountService.accountInfo(vasya, 1);
//
//        System.out.println(bankService.sum(bank));
//        System.out.println(bankService.count(bank));
//        accountService.showType(bank, "urgent");
//        bankService.list(bank);



//====================================================================


    }
}
