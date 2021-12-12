package com.bank.service;

import com.bank.manager.SahajBankingManager;
import com.bank.model.Account;
import com.bank.model.Transaction;

/**
 * Singleton Class
 */
public class SahajBankingService implements BankingService {
    private static SahajBankingService sahajBankingService = null;


    private SahajBankingService(){}
    public static SahajBankingService getInstance(){
        if(sahajBankingService == null){
            sahajBankingService = new SahajBankingService();
        }
        return sahajBankingService;
    }

    @Override
    public long createAccount(Transaction transaction) {
        // CREATE "Amit Duggal"
        if(transaction!=null){
            String[] args = commandSplit(transaction.getTransactionCommand());
            String name = args[1];
            Account account = new Account(name);
            transaction.setActionAccount(account);
            return SahajBankingManager.getInstance().createAccount(transaction);
        }
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

    private String[] commandSplit(String command){
        if(command!= null && !command.isBlank()){
            String[] split = command.split(" ");
            return split;
        }
        return null;
    }
    // Validate conditions here before sending to Manager Layer
}
