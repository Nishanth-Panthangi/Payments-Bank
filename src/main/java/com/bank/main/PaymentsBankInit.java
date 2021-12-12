package com.bank.main;

import com.bank.model.Transaction;
import com.bank.model.TransactionType;
import com.bank.service.TransactionService;

import java.util.Scanner;

public class PaymentsBankInit {
    public static void main(String[] args){
        System.out.println("Welcome to Sahaj Payments Bank");
        Scanner scanner = new Scanner(System.in);
        String inputCommand = null;
        do{
            try {
                inputCommand = scanner.next();
                if (inputCommand == null || inputCommand.isBlank()) {
                    throw new IllegalArgumentException();
                }
                String[] commandARGS = inputCommand.split(" ");
                Transaction transaction = new Transaction();
                if (commandARGS != null && commandARGS.length > 0) {
                    TransactionType transactionType = TransactionType.valueOf(commandARGS[0]);
                    transaction.setTransactionType(transactionType);
                    transaction.setTransactionCommand(inputCommand);
                    transactionType.process(transaction);
                }
            }catch (Exception e){
                System.out.println("Invalid Command - Provide Valid Input Command - Exiting code");
                break;
            }
        }while(true);
    }
}

