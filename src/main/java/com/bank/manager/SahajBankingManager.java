package com.bank.manager;

import com.bank.model.Transaction;
import com.bank.service.SahajBankingService;

public class SahajBankingManager implements BankingManager{
    private static SahajBankingManager sahajBankingManager = null;

    private SahajBankingManager(){}
    public static SahajBankingManager getInstance(){
        if(sahajBankingManager == null){
            sahajBankingManager = new SahajBankingManager();
        }
        return sahajBankingManager;
    }

    @Override
    public long createAccount(Transaction transaction) {
        return 0;
    }

    @Override
    public long getBankBalance(Transaction transaction) {
        return 0;
    }

    @Override
    public long depositAmount(Transaction transaction) {
        return 0;
    }

    @Override
    public long withdrawAmount(Transaction transaction) {
        return 0;
    }

    @Override
    public boolean transferAmount(Transaction transaction) {
        return false;
    }
}
