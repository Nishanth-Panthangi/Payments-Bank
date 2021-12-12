package com.bank.model;

public class Transaction {
    private String transactionCommand;
    private long actionAccountNumber;
    private long recipientAccountNumber;
    private TransactionType transactionType;
    private long amount;

    public long getRecipientAccountNumber() {
        return recipientAccountNumber;
    }

    public void setRecipientAccountNumber(long recipientAccountNumber) {
        this.recipientAccountNumber = recipientAccountNumber;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getTransactionCommand() {
        return transactionCommand;
    }

    public void setTransactionCommand(String transactionCommand) {
        this.transactionCommand = transactionCommand;
    }

    public long getActionAccountNumber() {
        return actionAccountNumber;
    }

    public void setActionAccountNumber(long actionAccountNumber) {
        this.actionAccountNumber = actionAccountNumber;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
}
