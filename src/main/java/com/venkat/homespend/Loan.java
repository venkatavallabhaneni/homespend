package com.venkat.homespend;

public class Loan {

    private Number amount;
    private String loanType;

    public Number getAmount() {
        return amount;
    }

    public void setAmount(Number amount) {
        this.amount = amount;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Loan(Number amount, String loanType) {
        this.amount = amount;
        this.loanType = loanType;
    }
}


