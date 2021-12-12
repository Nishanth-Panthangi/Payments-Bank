package com.bank.model;

public class Transanction {
    private String transanctionId;
    private Account actionAccount;
    private TransanctionType transanctionType;

    public String getTransanctionId() {
        return transanctionId;
    }

    public void setTransanctionId(String transanctionId) {
        this.transanctionId = transanctionId;
    }

    public Account getActionAccount() {
        return actionAccount;
    }

    public void setActionAccount(Account actionAccount) {
        this.actionAccount = actionAccount;
    }

    public TransanctionType getTransanctionType() {
        return transanctionType;
    }

    public void setTransanctionType(TransanctionType transanctionType) {
        this.transanctionType = transanctionType;
    }
}
