package com.bank.service;

import com.bank.model.Transaction;

public interface BankingService {
    public long createAccount(Transaction transaction);
    public long getBankBalance(Transaction transaction);
    public long depositAmount(Transaction transaction);
    public long withdrawAmount(Transaction transaction);
    public boolean transferAmount(Transaction transaction);
}
