package com.bank.model;

import com.bank.service.BankingService;
import com.bank.service.SahajBankingService;

public enum TransactionType {

    DEPOSIT{
        @Override
        public void process(Transaction transaction) {
            BankingService bankingService = SahajBankingService.getInstance();
            bankingService.depositAmount(transaction);
        }
    },
    WITHDRAW {
        @Override
        public void process(Transaction transaction) {
            BankingService bankingService = SahajBankingService.getInstance();
            bankingService.withdrawAmount(transaction);
        }
    },
    TRANSFER {
        @Override
        public void process(Transaction transaction) {
            BankingService bankingService = SahajBankingService.getInstance();
            bankingService.transferAmount(transaction);
        }
    },
    CREATE {
        @Override
        public void process(Transaction transaction) {
            BankingService bankingService = SahajBankingService.getInstance();
            bankingService.createAccount(transaction);
        }
    },
    BALANCE {
        @Override
        public void process(Transaction transaction) {
            BankingService bankingService = SahajBankingService.getInstance();
            bankingService.getBankBalance(transaction);
        }
    };

    public abstract void process(Transaction transaction);
}
