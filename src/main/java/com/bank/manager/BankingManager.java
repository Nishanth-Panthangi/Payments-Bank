package com.bank.manager;

import com.bank.model.Transaction;

public interface BankingManager {
    public long createAccount(Transaction transaction);
    public long getBankBalance(Transaction transaction);
    public long depositAmount(Transaction transaction);
    public long withdrawAmount(Transaction transaction);
    public boolean transferAmount(Transaction transaction);
}
