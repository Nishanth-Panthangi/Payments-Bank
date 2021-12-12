package com.bank.service;

public interface BankingService {
    public long createAccount(String accountHolderName);
    public long getBankBalance(long accountNumber);
    public long depositAmount(long accountNumber, long Amount);
    public long withdrawAmount(long accountNumber, long Amount);
    public boolean transferAmount(long sourceAccNumber, long targetAccountNum, long ammount);
}
