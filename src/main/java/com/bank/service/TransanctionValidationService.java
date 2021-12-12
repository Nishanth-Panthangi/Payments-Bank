package com.bank.service;

public interface TransanctionValidationService {
    public boolean validateAccount();
    public boolean balanceValidation();
    public boolean minMaxDepositLimit();
    public boolean minMaxWithdrawalLimit();
    public boolean depositDailyCapLimit();
    public boolean withdrawalDailyCapLimit();
}
