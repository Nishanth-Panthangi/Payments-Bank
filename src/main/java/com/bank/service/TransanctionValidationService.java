package com.bank.service;

public interface TransanctionValidationService {
    public boolean validateAccount();
    public boolean balanceValidation();
    public boolean minMaxDepositLimit();
    public boolean minMaxWithdrawlLimit();
    public boolean depositDailyCapLimit();
    public boolean withdrawalDailyCapLimit();
}
