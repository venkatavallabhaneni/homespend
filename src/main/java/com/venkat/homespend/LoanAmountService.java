package com.venkat.homespend;

import org.springframework.stereotype.Service;

@Service
public class LoanAmountService implements ILoanAmount {
    /**
     * @param loanType
     * @return
     */
    @Override
    public Loan getLoanAmount(String loanType) {
        Number loanAmount;

        switch (loanType) {
            case "HomeLoan":
                loanAmount = 65000;
                break;
            case "PersonalLoan":
                loanAmount = 55000;
                break;
            case "CarLoan":
                loanAmount = 30000;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + loanType);
        }
       return new Loan(loanAmount,loanType);
    }
}
