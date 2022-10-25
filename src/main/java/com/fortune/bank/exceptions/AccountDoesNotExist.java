package com.fortune.bank.exceptions;

public class AccountDoesNotExist extends IllegalArgumentException {
    public AccountDoesNotExist(String s) {
        super(s);
    }
}
