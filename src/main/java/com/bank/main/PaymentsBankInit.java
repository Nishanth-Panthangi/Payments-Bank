package com.bank.main;

import com.bank.model.Transanction;
import com.bank.model.TransanctionType;

import java.util.Scanner;

public class PaymentsBankInit {
    public static void main(String[] args){
        System.out.println("Welcome to Sahaj Payments Bank");
        Scanner scanner = new Scanner(System.in);
        String inputCommand = null;
        do{
            inputCommand = scanner.nextLine();
            String[] commandARGS = inputCommand.split(" ");
            Transanction transanction = new Transanction();
            if(commandARGS!=null && commandARGS.length>0){
                try {
                    TransanctionType transanctionType = TransanctionType.valueOf(commandARGS[0]);
                    transanction.setTransanctionType(transanctionType);
                }catch (IllegalArgumentException e){
                    System.out.println("Invalid Command - Provide Valid Input Command - Exiting code");
                    break;
                }
            }
            System.out.println(transanction.getTransanctionType().name());
        }while(true);
    }
}

