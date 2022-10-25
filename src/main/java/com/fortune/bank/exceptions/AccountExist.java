package com.fortune.bank.exceptions;

public class AccountExist extends IllegalArgumentException {
    public AccountExist(String s) {
        super(s);
    }
}
