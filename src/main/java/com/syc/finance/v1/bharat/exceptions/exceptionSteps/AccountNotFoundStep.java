package com.syc.finance.v1.bharat.exceptions.exceptionSteps;

public class AccountNotFoundStep extends RuntimeException{

    public AccountNotFoundStep(String message){
        super(message);
    }
}
