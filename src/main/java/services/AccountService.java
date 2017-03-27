package services;

import model.Account;
import model.Bank;
import model.Depositor;

/**
 * Created by Oleg on 25.03.2017.
 */

public class AccountService {

    private boolean checkAcc(Bank bank, Account account) {
        boolean flag = false;
        for (Depositor dep : bank.getListOfClients()) {
            for (Account acc : dep.getLstOfAccount()) {
                if (acc.getAccountId() == account.getAccountId() || acc.getAmountOnDeposit() < 0 || acc.getTimeConstrains() < 0) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public void addDeposit(Bank bank, Depositor depositor, Account account) {
        for (Account acc : depositor.getLstOfAccount()) {
            if (acc.getAccountId() == account.getAccountId()) {
                System.out.println("ERROR");
                return;
            }
        }

        if (checkAcc(bank, account)) {
            System.out.println("ERROR: Account " + account.getAccountId() + " wasn't created");
        } else {
            depositor.getLstOfAccount().add(account);
            System.out.println("Account " + account.getAccountId() + " was created");
        }
    }

    public void delete(Depositor depositor, int accountId) {
        for (Account acc : depositor.getLstOfAccount()) {
            if (acc.getAccountId() == accountId) {
                depositor.getLstOfAccount().remove(acc);
                break;
            }
        }
        System.out.println(accountId + " deleted");
    }

    public void showType(Bank bank, String type) {
        for (Depositor depositor : bank.getListOfClients()) {
            for (Account acc : depositor.getLstOfAccount()) {
                if (acc.getType().toString().equals(type))
                    System.out.println(acc);
            }
        }
    }

    public void accountInfo(Depositor depositor, int accountId) {
        for (Account acc : depositor.getLstOfAccount()) {
            if (acc.getAccountId() == accountId) {
                System.out.println(acc);
            }
        }
    }
}
