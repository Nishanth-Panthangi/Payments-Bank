package com.bank.service;

import com.bank.model.Transaction;

/**
 * Singleton Class
 */
public class SahajBankingService implements BankingService {
    private static SahajBankingService sahajBankingService = null;

    private SahajBankingService(){

    }
    public static SahajBankingService getInstance(){
        if(sahajBankingService == null){
            sahajBankingService = new SahajBankingService();
        }
        return sahajBankingService;
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
    // Validate conditions here before sending to Manager Layer
}
