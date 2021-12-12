package com.bank.service;


public class SahajTransanctionValidationService implements TransanctionValidationService{
    /**
     * Account number entered during deposit or withdrawal should be valid
     * @return whether the account number exists or not
     */
    @Override
    public boolean validateAccount() {
        return false;
    }

    /**
     * Account has sufficient balance during withdrawals
     * Account balance cannot exceed ₹1,00,000
     * Account balance cannot be less than ₹0
     * @return
     */
    @Override
    public boolean balanceValidation() {
        return false;
    }

    /**
     * The minimum deposit amount is ₹500 per transaction
     * The maximum deposit amount is ₹50,000 per transaction
     * @return
     */
    @Override
    public boolean minMaxDepositLimit() {
        return false;
    }

    /**
     * The minimum withdrawal amount is ₹1,000 per transaction
     * The maximum withdrawal amount is ₹25,000 per transaction
     * @return
     */
    @Override
    public boolean minMaxWithdrawlLimit() {
        return false;
    }

    /**
     * No more than 3 deposits are allowed in a day
     * @return false if deposit transanctions exceed more than 3
     */
    @Override
    public boolean depositDailyCapLimit() {
        return false;
    }

    /**
     * No more than 3 withdrawals are allowed in a day
     * @return false if withdrawal transanctions exceed more than 3
     */
    @Override
    public boolean withdrawalDailyCapLimit() {
        return false;
    }
}
