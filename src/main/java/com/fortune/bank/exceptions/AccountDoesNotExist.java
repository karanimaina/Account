package com.fortune.bank.bank.exceptions;

public class AccountDoesNotExist extends IllegalArgumentException {
    public AccountDoesNotExist(String s) {
        super(s);
    }
}
