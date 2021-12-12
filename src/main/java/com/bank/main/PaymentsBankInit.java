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
            inputCommand = scanner.nextLine();
            String[] commandARGS = inputCommand.split(" ");
            Transaction transaction = new Transaction();
            if(commandARGS!=null && commandARGS.length>0){
                try {
                    TransactionType transactionType = TransactionType.valueOf(commandARGS[0]);
                    transaction.setTransactionType(transactionType);

                }catch (IllegalArgumentException e){
                    System.out.println("Invalid Command - Provide Valid Input Command - Exiting code");
                    break;
                }
            }
            System.out.println(transaction.getTransactionType().name());
        }while(true);
    }
}

