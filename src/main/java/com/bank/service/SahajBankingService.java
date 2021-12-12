package com.bank.service;

public class SahajBankingService implements BankingService {
    @Override
    public long createAccount(String accountHolderName) {
        return 0;
    }

    @Override
    public long getBankBalance(long accountNumber) {
        return 0;
    }

    @Override
    public long depositAmount(long accountNumber, long Amount) {
        return 0;
    }

    @Override
    public long withdrawAmount(long accountNumber, long Amount) {
        return 0;
    }

    @Override
    public boolean transferAmount(long sourceAccNumber, long targetAccountNum, long ammount) {
        return false;
    }
    // Validate conditions here before sending to Manager Layer
}
