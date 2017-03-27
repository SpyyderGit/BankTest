package model;

/**
 * Created by Oleg on 25.03.2017.
 */

public class Account {
    private int accountId;
    private double amountOnDeposit;
    private double profitability;
    private int timeConstrains;
    private Type type;


    public Account(int accountId, double amountOnDeposit, double profitability, int timeConstrains, Type type) {
        this.accountId = accountId;
        this.amountOnDeposit = amountOnDeposit;
        this.profitability = profitability;
        this.timeConstrains = timeConstrains;
        this.type = type;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getAmountOnDeposit() {
        return amountOnDeposit;
    }

    public void setAmountOnDeposit(double amountOnDeposit) {
        this.amountOnDeposit = amountOnDeposit;
    }

    public double getProfitability() {
        return profitability;
    }

    public void setProfitability(double profitability) {
        this.profitability = profitability;
    }

    public int getTimeConstrains() {
        return timeConstrains;
    }

    public void setTimeConstrains(int timeConstrains) {
        this.timeConstrains = timeConstrains;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (accountId != account.accountId) return false;
        if (Double.compare(account.amountOnDeposit, amountOnDeposit) != 0) return false;
        if (Double.compare(account.profitability, profitability) != 0) return false;
        if (timeConstrains != account.timeConstrains) return false;
        return type == account.type;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = accountId;
        temp = Double.doubleToLongBits(amountOnDeposit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(profitability);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + timeConstrains;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", amountOnDeposit=" + amountOnDeposit +
                ", profitability=" + profitability +
                ", timeConstrains=" + timeConstrains +
                ", type=" + type +
                '}';
    }
}