package com.fortune.bank.bank.exceptions;

public class CustomerDoesNotExist extends IllegalArgumentException {
    public CustomerDoesNotExist(String s) {
        super(s);
    }
}
